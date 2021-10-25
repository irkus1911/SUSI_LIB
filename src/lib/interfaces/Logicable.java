/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.interfaces;

import lib.datamodel.User;
import lib.exceptions.IncorrectUserException;
import lib.exceptions.IncorrectPasswordException;
import lib.exceptions.IncorrectEmailException;
import lib.exceptions.UserDontExistException;
import lib.exceptions.UserExistException;
import lib.exceptions.PasswordDontMatchException;
import lib.exceptions.ConnectException;

/**
 *
 * @author UnaiUrtiaga
 */
public interface Logicable {
    
    /**
     * Metodo signIn para iniciar sesion en nuestra aplicacion
     * @param user Parametro de tipo User enviada desde fuera
     * @return Devolvera un objeto de tipo usuario
     * @throws IncorrectUserException Lanza la excepcion cuando el patron del usuario 
     * no es el adecuado
     * @throws IncorrectPasswordException Lanza la excepcion cuando el patron de
     * la contraseña no es el adecuado
     * @throws UserDontExistException Lanza la excepcion si el usuario introducido
     * no existe en la base de datos
     * @throws PasswordDontMatchException Lanza la excepcion si la contraseña
     * introducida no coincide con la contraseña de la base de datos
     * @throws ConnectException Lanza la excepcion cuando no se ha podido conectar
     * con la base de datos
     */
    
    public User signIn(User user) throws IncorrectUserException, IncorrectPasswordException, 
            UserDontExistException, PasswordDontMatchException, ConnectException;
    
    
    /**
     * Motodo singUp para registrarse en nuestra aplicacion
     * @param user Parametro tipo User enviada desde fuera
     * @return Devolvera un objeto de tipo usuario
     * @throws IncorrectUserException Lanza la excepcion cuando el patron del usuario 
     * no es el adecuado
     * @throws IncorrectPasswordException Lanza la excepcion cuando el patron de
     * la contraseña no es el adecuado
     * @throws IncorrectEmailException Lanza la excepcion cuando el patron del email
     * no es el adecuado
     * @throws UserExistException Lanza la excepcion cuando el usuario introducido
     * ya esta en la base de datos
     * @throws PasswordDontMatchException Lanza la excepcion cuando las contraseñas
     * del campo Password y ConfirmPassword no son iguales
     * @throws ConnectException Lanza la excepcion cuando no se ha podido conectar
     * con la base de datos
     */
    
    public User signUp(User user) throws IncorrectUserException, IncorrectPasswordException, 
            IncorrectEmailException, UserExistException, PasswordDontMatchException,
            ConnectException;
    
}
