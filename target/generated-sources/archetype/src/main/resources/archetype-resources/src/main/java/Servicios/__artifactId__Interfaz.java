#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package Servicios;
import java.util.ArrayList; 
import java.sql.Connection;
import Dtos.*;
public interface ${artifactId}Interfaz {
	/**
	 * Método que devuelve un array para mostrar los libros que existen
	 * en la base de datos
	 * @param conexion
	 * */
	public void MostrarLibros(Connection conexion);
	/**
	 * Método para actualizar los datos de un registro de la base de datos
	 * @param conexion
	 * */
	public void ActualizarLibros(Connection conexion);
	/**
	 * Método para crear un nuevo registro en la base de datos
	 * @param conexion
	 * */
	public void CrearLibros(Connection conexion);
	/**
	 * Método para borrar un registro de la base de datos
	 * @param conexion
	 * */
	public void BorrarLibros(Connection conexion);
}
