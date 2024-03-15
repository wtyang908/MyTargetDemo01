package com.example.demo.Controller.ex;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.Controller.ex
 * @className: DiseaseNotFoundException
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/18 14:47
 * @version: 1.0
 */
public class DiseaseNotFoundException extends BaseException{
    public DiseaseNotFoundException() {
        super();
    }

    public DiseaseNotFoundException(String message) {
        super(message);
    }

    public DiseaseNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DiseaseNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DiseaseNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
