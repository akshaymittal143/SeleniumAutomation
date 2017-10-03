package packt.selenium.chap5_2.pageobjects;

/**
 * Created by Ripon on 11/4/2015.
 */
public class WrongPageException extends RuntimeException{

    public WrongPageException(String message){
        super(message);
    }
}