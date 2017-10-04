package packt.selenium.chap5_2.pageobjects;

public class WrongPageException extends RuntimeException{

    public WrongPageException(String message){
        super(message);
    }
}