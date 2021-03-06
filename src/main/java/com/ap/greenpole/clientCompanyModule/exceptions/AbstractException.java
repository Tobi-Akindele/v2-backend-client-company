package com.ap.greenpole.clientCompanyModule.exceptions;

/**
 * Created by Lewis.Aguh on 19/08/2020.
 */

public class AbstractException extends RuntimeException {
	private static final long serialVersionUID = 1L;
    String code;

    public AbstractException(String code, String message){
        super(message);
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
}
