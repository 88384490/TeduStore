package cn.tedu.store.service.ex;

public class EmailAlreadyExistException extends RuntimeException{

    private static final long serialVersionUID = 9049669771097674787L;

    public EmailAlreadyExistException (){

    }

    public EmailAlreadyExistException (String ExceptionMsg){
        super(ExceptionMsg);
    }
}
