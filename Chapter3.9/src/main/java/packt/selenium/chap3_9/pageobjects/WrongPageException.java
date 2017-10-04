package packt.selenium.chap3_9.pageobjects;

/**
 * Created by Ripon on 11/19/2015.
 */
public class WrongPageException extends RuntimeException{
    public WrongPageException(String message){
        super(message);
    }
}