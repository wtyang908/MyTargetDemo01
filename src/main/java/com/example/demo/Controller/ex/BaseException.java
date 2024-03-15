package com.example.demo.Controller.ex;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.Controller.ex
 * @className: BaseException
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/18 13:19
 * @version: 1.0
 */
public class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    protected BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
