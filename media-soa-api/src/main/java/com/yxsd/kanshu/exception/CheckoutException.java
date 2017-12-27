package com.yxsd.kanshu.exception;

import com.yxsd.kanshu.constant.ErrorCodeEnum;

/**
 * 出版物电子书结算错误异常
 */
public class CheckoutException extends RuntimeException {

	private static final long serialVersionUID = -8634700792767837033L;

	public ErrorCodeEnum errorCode;

	public CheckoutException(String message, ErrorCodeEnum errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
}
