package com.app.errorcode;

public class ErrorMsg {

	private String errMsg;

	public ErrorMsg(String errMsg) {
		super();
		this.errMsg = errMsg;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	@Override
	public String toString() {
		return "ErrorMsg [errMsg=" + errMsg + "]";
	}
	
	
}
