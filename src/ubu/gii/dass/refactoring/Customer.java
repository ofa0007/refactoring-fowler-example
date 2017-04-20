package ubu.gii.dass.refactoring;

/**
* Tema  Refactorizaciones 
*
* Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones gen�ricas de java 1.5
*
* @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
* @version 1.1
* @see java.io.File
*
*/
import java.util.*;

public class Customer {
	private String _name;
	private List<Rental> _rentals;

	public Customer(String name) {
		_name = name;
		_rentals = new ArrayList<Rental>();

	};

	public void addRental(Rental arg) {
		_rentals.add(arg);
	}

	public String getName() {
		return _name;
	};

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasNext()) {
			Rental rental = rentals.next();

			double amount = rental.costOfRent();

			frequentRenterPoints += addFrequentPoints(rental);
			// show figures for this rental
			result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(amount) + "\n";
			totalAmount += amount;
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;
	}
	
	public String statementHTML() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		String result = "<h1>Rental Record for " + getName() + "</h1>";
		while (rentals.hasNext()) {
			Rental rental = rentals.next();

			double amount = rental.costOfRent();

			frequentRenterPoints += addFrequentPoints(rental);
			// show figures for this rental
			result += "<h2>" + rental.getMovie().getTitle() + " " + String.valueOf(amount) + "</h2>";
			totalAmount += amount;
		}
		// add footer lines
		result += "<p>Amount owed is " + String.valueOf(totalAmount) + "</p>";
		result += "<p>You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points</p>";
		return result;
	}

	private int addFrequentPoints(Rental each) {
		// add frequent renter points
		int frequentRenterPoints = 1;
		// add bonus for a two day new release rental
		if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}
	
}
