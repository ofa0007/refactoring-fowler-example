package ubu.gii.dass.refactoring;


public class Aplicacion {

	public static void main(String[] arg) {
		TypeMovie regular = new TypeMovie(2, 2, 1.5, 0, 0);
		TypeMovie newRelease = new TypeMovie(0, 0, 3, 1, 1);
		TypeMovie children = new TypeMovie(3, 1.5, 1.5, 0, 0);
		
		Movie m1 = new Movie("Sky Captain", newRelease);
		Movie m2 = new Movie("Alejandro Magno", newRelease);
		Movie m3 = new Movie("Accion Mutante", regular);
		Movie m4 = new Movie("Hermano Oso", children);

		Customer c1 = new Customer("Manuel");

		Rental r1 = new Rental(m1, 5);
		Rental r2 = new Rental(m3, 1);
		Rental r3 = new Rental(m4, 10);

		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(r3);

		System.out.println(c1.statement());

	}

}