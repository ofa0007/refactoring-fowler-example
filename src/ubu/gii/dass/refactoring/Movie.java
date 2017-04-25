package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicación de refactorizaciones. Actualizado para colecciones
 * genéricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos López</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie {
	
	private TypeMovie typeMovie;

	private String _title;

	public Movie(String title, TypeMovie typeMovie) {
		_title = title;
		this.typeMovie = typeMovie;
	}

	public TypeMovie getTypeMovie() {
		return typeMovie;
	}

	public void setTypeMovie(TypeMovie typeMovie) {
		this.typeMovie = typeMovie;
	}

	public String getTitle() {
		return _title;
	}
	

}
