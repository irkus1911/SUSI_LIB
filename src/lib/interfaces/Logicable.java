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
    
    public User signIn(User user) throws IncorrectUserException, IncorrectPasswordException, 
            UserDontExistException, ConnectException;
    
    public User signUp(User user) throws IncorrectUserException, IncorrectPasswordException, 
            IncorrectEmailException, UserExistException, PasswordDontMatchException,
            ConnectException;
    
}
