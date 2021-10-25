/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.exceptions;

/**
 *
 * @author Irkus de la Fuente
 */
public class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String mensaje){
        super(mensaje);
    }
}
