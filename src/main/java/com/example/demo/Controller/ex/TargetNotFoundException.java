package com.example.demo.Controller.ex;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.Controller.ex
 * @className: TargetNotFoundException
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/18 13:20
 * @version: 1.0
 */
public class TargetNotFoundException extends BaseException{
    public TargetNotFoundException() {
        super();
    }

    public TargetNotFoundException(String message) {
        super(message);
    }

    public TargetNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TargetNotFoundException(Throwable cause) {
        super(cause);
    }

    protected TargetNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
