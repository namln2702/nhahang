//package com.rs.nhahang.handlerException;
//
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class GlobalException {
//
//    @ExceptionHandler(value = RuntimeException.class)
//    ResponseEntity<?> handlingRuntimeException(RuntimeException runtimeException){
//        NameException nameException = NameException.NOTFOUND;
//
//        return ResponseEntity.badRequest().body(nameException);
//    }
//}
