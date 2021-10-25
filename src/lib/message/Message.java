/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.message;
import lib.datamodel.User;
/**
 *
 * @author Adrián Franco
 */
public class Message {
    
    private User user;
    private enum msg{
    LOGIN, SIGNUP, SIGNIN, OK, INCORRECTUSEREXCEPTION, INCORRECTPASSWORDEXCEPTION,
    INCORRECTEMAILEXCEPTION, USERDONTEXISTEXCEPTION,USEREXISTEXCEPTION,
    PASSWORDDONTMATCHEXCEPTION, CONNECTEXCEPTION;
    }        
}
