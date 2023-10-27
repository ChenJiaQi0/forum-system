package top.chen.forum.common.handler;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.chen.forum.common.exception.ServiceException;
import top.chen.forum.common.resp.Result;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 业务异常统一处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    public Result<?> exceptionHandler(ServiceException e){
        Result<?> resp = new Result<>();
        resp.setCode(500);
        resp.setMsg(e.getMessage());
        return resp;
    }

    /**
     * 数据校验异常统一处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public Result<?> exceptionHandler(MethodArgumentNotValidException e){
        Result<?> resp = new Result<>();
        resp.setCode(Integer.parseInt(HttpStatus.BAD_REQUEST.toString()));
        resp.setMsg("请求参数错误");
        return resp;
    }
}
