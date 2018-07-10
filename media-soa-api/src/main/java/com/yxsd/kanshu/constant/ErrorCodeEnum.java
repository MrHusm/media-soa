package com.yxsd.kanshu.constant;

public enum ErrorCodeEnum {

	ERROR_CODE_10000(10000, "未知错误！"),
	ERROR_CODE_10001(10001, "网络错误!"),
	ERROR_CODE_10002(10002, "参数非法!"),
	ERROR_CODE_10003(10003, "未登录用户！"),
	ERROR_CODE_10004(10004, "没有权限！"),
	ERROR_CODE_10005(10005, "系统没有配置相应参数！"),
	ERROR_CODE_10006(10006, "参数内容不存在！"),
	ERROR_CODE_10007(10007, "没有数据！"),
	ERROR_CODE_10008(10008, "系统错误!"),
	ERROR_CODE_10009(10009, "token错误!"),
	ERROR_CODE_10011(100011, "未找到所请求的action"),

	ERROR_CODE_99999(99999, "未定义错误");

	private Integer errorCode;
	private String errorMessage;

	private ErrorCodeEnum(Integer errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public static ErrorCodeEnum getByErrorCode(int errorCode) {
		ErrorCodeEnum[] arr$ = values();
		int len$ = arr$.length;

		for(int i$ = 0; i$ < len$; ++i$) {
			ErrorCodeEnum errorCodeEnum = arr$[i$];
			if(errorCodeEnum.errorCode.intValue() == errorCode) {
				return errorCodeEnum;
			}
		}

		return null;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
