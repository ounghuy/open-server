package com.wadpam.open.exceptions;

import org.springframework.http.HttpStatus;

/**
 * Base class for all REST exceptions
 * @author sosandstrom
 */
public class RestException extends RuntimeException {
    private int code;
    private String developerMessage;
    private String moreInfo;
    private HttpStatus status;


    public RestException(int code, HttpStatus status, String message) {
        this(code, null, null, status, message);
    }

    public RestException(int code, String developerMessage, String moreInfo,
                         HttpStatus status, String message) {
        super(message);
        this.code = code;
        this.developerMessage = developerMessage;
        this.status = status;
        this.moreInfo = moreInfo;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }
    
}
