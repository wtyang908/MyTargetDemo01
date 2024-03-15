package com.example.demo.Controller;

import com.example.demo.entity.TargetDiseaseMappping;
import com.example.demo.service.impl.TargetDiseaseMapppingServiceImpl;
import com.example.demo.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.Controller
 * @className: TargetDiseaseMapppingController
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/18 14:33
 * @version: 1.0
 */
@RestController
@RequestMapping("targetDiseaseMappping")
public class TargetDiseaseMapppingController extends ExceptionController{
    @Resource
    private TargetDiseaseMapppingServiceImpl targetDiseaseMapppingService;

    @GetMapping("/queryByTargetId/{targetid}")
    public JsonResult<TargetDiseaseMappping> queryByTargetId(@PathVariable("targetid") String targetid){
        return new JsonResult<>(200,targetDiseaseMapppingService.queryByTargetId(targetid));
    }
}
