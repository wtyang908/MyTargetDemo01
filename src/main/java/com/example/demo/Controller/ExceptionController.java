package com.example.demo.Controller;

import com.example.demo.Controller.ex.BaseException;
import com.example.demo.Controller.ex.DiseaseNotFoundException;
import com.example.demo.Controller.ex.TargetNotFoundException;
import com.example.demo.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.Controller
 * @className: ExceptionController
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/18 13:20
 * @version: 1.0
 */
public class ExceptionController {
    @ExceptionHandler({BaseException.class})
    public JsonResult<Void> handleException(Throwable e){
        JsonResult<Void> result = new JsonResult<>(e);
        if(e instanceof TargetNotFoundException){
            result.setState(4000);
//            result.setMessage("靶点未找到");
        }else if(e instanceof DiseaseNotFoundException){
            result.setState(4001);
//            result.setMessage("疾病未找到");
        }
        return  result;
    }
}
