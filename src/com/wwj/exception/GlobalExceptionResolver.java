package com.wwj.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wwj.model.Girl;

/**
 * 
 * 全局Controller层异常处理类
 *
 * @author Yun
 *
 */

@ControllerAdvice
public class GlobalExceptionResolver {

	
	   /**
     * 处理所有业务异常
     *
     * @param e 业务异常
     * @return json结果
     */
    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Girl handleOpdRuntimeException(ServiceException e) {
    		Girl g = new Girl();
    		g.setAge(18);
    		g.setName("wwj");
        return g;
    }

}
