package cn.tedu.store.service.ex;

/**
 * 用户名已存在错误
 */
public class UsernameAlreadyExistException extends RuntimeException{
    private static final long serialVersionUID = -5916370894847140757L;

    public UsernameAlreadyExistException(){

    }

    /**
     * 用户名已存在错误类型
     * @param ExceptionMsg 错误信息
     */
    public UsernameAlreadyExistException(String ExceptionMsg){
        super(ExceptionMsg);
    }
}
