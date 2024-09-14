package com.rs.nhahang.handlerException;


import lombok.Data;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum NameException {
    NOTFOUND(1000,"URL NOT FOUND",HttpStatus.NOT_FOUND);
    private int code;
    private String message;
    private HttpStatus status;

    NameException(int code, String message, HttpStatus status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }
}
