package com.example.demo.Controller;


import com.example.demo.entity.Target;
import com.example.demo.service.ITargetService;
import com.example.demo.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @projectName: MyTarget
 * @package: com.wtyang.mytarget.controller
 * @className: TargetController
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/16 21:45
 * @version: 1.0
 */
@RestController
@RequestMapping("target")
public class TargetController extends ExceptionController{

    @Resource
    private ITargetService targetService;

    @GetMapping("/queryById/{targetid}")
    public JsonResult<Target> queryByTargetId(@PathVariable("targetid") String targetid){
         return new JsonResult<>(200,targetService.queryByTargetId(targetid));
    };

    @GetMapping("/queryByIdNameAndSynonyms/{targetid}")
    public JsonResult<List<Target>> queryByIdNameAndSynonyms(@PathVariable("targetid") String targetid){
        return new JsonResult<>(200,targetService.queryByIdNameAndSynonyms(targetid));
    };
}
