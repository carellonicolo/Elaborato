/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.rmi.AlreadyBoundException;

/**
 *
 * @author nicolocarello
 */
public class UserAlreadyExist extends AlreadyBoundException{
    public UserAlreadyExist(String s){
        super(s);
    }
}
