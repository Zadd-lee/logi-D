package com.mink.logid.common.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum UserError implements ErrorCode {

    //404 NOT_FOUND 잘못된 리소스 접근
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다"),

    //409 CONFLICT 중복된 리소스
    ALREADY_SAVED_USER(HttpStatus.CONFLICT, "이미 저장된 사용자입니다");


    private final HttpStatus httpStatus;
    private final String message;

}
