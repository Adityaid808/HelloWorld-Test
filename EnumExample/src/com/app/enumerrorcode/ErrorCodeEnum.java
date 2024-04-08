package com.app.enumerrorcode;

public enum ErrorCodeEnum {

	OTP_FAIL_ERROR("internal server problem error during otp service", "RA-01"),
	EKYC_FAIL_ERROR("Ekyc internal error", "RA-02");
	
	private final String errMsg;
	private final String errCode;
	private ErrorCodeEnum(String errMsg, String errCode) {
		this.errMsg = errMsg;
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public String getErrCode() {
		return errCode;
	}
		
}
