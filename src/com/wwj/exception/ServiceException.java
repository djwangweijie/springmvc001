package com.wwj.exception;
/**
 * 自定义异常
 * @author Yun
 *
 */
public class ServiceException extends RuntimeException {

	public ServiceException(String msg){
		super(msg);
	}

}
