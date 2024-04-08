package com.app.errorcode;

public class ErrorCode {
	
    String errMsg;
    String code;
    
	public ErrorCode(String errMsg, String code) {
		super();
		this.errMsg = errMsg;
		this.code = code;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ErrorCode [errMsg=" + errMsg + ", code=" + code + "]";
	}
        
	public static final ErrorCode OTP_FAIL_ERROR = new ErrorCode("internal server problem error during otp service", "RA-01");
	public static final ErrorCode EKYC_FAIL_ERROR = new ErrorCode("Ekyc internal error", "RA-02");
	
}
