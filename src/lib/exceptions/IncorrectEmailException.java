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
public class IncorrectEmailException extends Exception {
    public IncorrectEmailException(String mensaje) {
        super(mensaje);
    }
}
