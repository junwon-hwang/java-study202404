package day10.exception;

// 사용자 정의 에러 => Exception 끝에 붙이는게 관례
public class InvalidLoginInputException extends Exception{

    public InvalidLoginInputException(){}

    public InvalidLoginInputException(String message){
        super(message);
    }
}
