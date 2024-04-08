package com.app.customException;

import com.app.enumerrorcode.ErrorCodeEnum;

public class CustomExceptionMsg extends Exception{

	String errMsg;
	String errCode;
	
	public CustomExceptionMsg() {
		super();
	}

	public CustomExceptionMsg(ErrorCodeEnum errorCodeEnum) {
		super();
		this.errMsg = errorCodeEnum.getErrMsg();
		this.errCode = errorCodeEnum.getErrCode();
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	
}
