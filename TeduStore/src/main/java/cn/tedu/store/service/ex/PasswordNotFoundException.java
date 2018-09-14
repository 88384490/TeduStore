package cn.tedu.store.service.ex;

public class PasswordNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 3260827032262987737L;

    public PasswordNotFoundException() {

    }

    public PasswordNotFoundException(String ExceptionMsg) {
        super(ExceptionMsg);
    }
    
}
