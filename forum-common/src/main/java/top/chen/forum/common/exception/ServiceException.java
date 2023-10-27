package top.chen.forum.common.exception;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: 自定义异常
 */
public class ServiceException extends RuntimeException{
    public ServiceException(String message) {
        super(message);
    }
}
