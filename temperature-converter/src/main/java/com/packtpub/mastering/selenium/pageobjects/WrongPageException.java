package com.packtpub.mastering.selenium.pageobjects;

/**
 * Created by Ripon on 11/28/2015.
 */
public class WrongPageException extends RuntimeException{
    public WrongPageException(String message){
        super(message);
    }
}