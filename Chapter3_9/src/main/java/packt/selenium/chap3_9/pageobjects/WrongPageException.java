package packt.selenium.chap3_9.pageobjects;

public class WrongPageException extends RuntimeException{
    public WrongPageException(String message){
        super(message);
    }
}