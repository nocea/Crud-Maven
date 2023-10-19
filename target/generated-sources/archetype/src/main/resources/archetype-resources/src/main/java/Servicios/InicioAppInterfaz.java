#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package Servicios;

import java.util.ArrayList; 
import Dtos.*;
/**
 * Clase que se usa como procedimiento de la aplicación.
 * */
public interface InicioAppInterfaz {
	/**
	 * Metodo para Mostrar un menú de opciones y devolver 
	 * la opción introducidas.
	 * */
	public int Menu();
}
