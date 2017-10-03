package packt.selenium.chap3_7.pageobjects;


public class WrongPageException extends RuntimeException{

    public WrongPageException(String message){

        super(message);
    }
}