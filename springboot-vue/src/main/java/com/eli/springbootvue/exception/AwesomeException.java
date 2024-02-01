package com.eli.springbootvue.exception;

/**
 * 统一异常类
 *
 * @author 钱海龙
 * @since 2024/1/25
 */
public class AwesomeException extends RuntimeException {
    public final int httpStatus;
    public final String code;

    public AwesomeException(int httpStatus, String code, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.code = code;
    }

    @Override
    public String toString() {
        return "statusCode: " + httpStatus + "\ncode: " + this.code + "\n" + super.toString();
    }
}
