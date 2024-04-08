package com.app.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.app.customException.CustomExceptionMsg;
import com.app.enumerrorcode.ErrorCodeEnum;
import com.app.errorcode.ErrorCode;

public class Tester {
    public static void main(String[] args) {
    	
    	// read errorcode and error msg using class level
        String errorMsg = ErrorCode.OTP_FAIL_ERROR.getErrMsg();
        String errorCode = ErrorCode.OTP_FAIL_ERROR.getCode();
        System.out.println(errorMsg+"        "+errorCode);
        
        
        //throws custom exception from enumClass 
        try {
        	if(errorCode.equals("RA-01")) {
        		throw new CustomExceptionMsg(ErrorCodeEnum.OTP_FAIL_ERROR);
        	}
        	      	
        }catch(CustomExceptionMsg e) {
        	System.out.println(e.getErrMsg()+"        "+e.getErrCode());
        }  
           
        // exception using try catch
        try {
        	  int a = 100/0;
              System.out.println(a);
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        
        ArrayList arrayList = new ArrayList();
        arrayList.add("aditya");
        arrayList.add("sambhaji");
        arrayList.add(1);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
       
        
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Aditya");
        hashMap.put(2, "Sambhaji");
        hashMap.put(3, "Akshata");
        
        for(Map.Entry m : hashMap.entrySet()) {
        	System.out.println(m.getKey()+"       "+m.getValue());
        }
        
        System.out.println("Hello World");
        
        
    }
}
