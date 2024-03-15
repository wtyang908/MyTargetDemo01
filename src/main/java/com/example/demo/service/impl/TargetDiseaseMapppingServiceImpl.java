package com.example.demo.service.impl;

import com.example.demo.Controller.ex.DiseaseNotFoundException;
import com.example.demo.entity.TargetDiseaseMappping;
import com.example.demo.mapper.TargetDiseaseMapppingMapper;
import com.example.demo.service.ITargetDiseaseMapppingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.service.impl
 * @className: TargetDiseaseMapppingServiceImpl
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/18 14:29
 * @version: 1.0
 */
@Service
public class TargetDiseaseMapppingServiceImpl implements ITargetDiseaseMapppingService {
    @Resource
    private TargetDiseaseMapppingMapper targetDiseaseMapppingMapper;

    @Override
    public TargetDiseaseMappping queryByTargetId(String targetid) {
        TargetDiseaseMappping res=targetDiseaseMapppingMapper.queryByTargetId(targetid);
        if(res==null){
            throw new DiseaseNotFoundException("未发现此靶点的疾病");
        }else {
            return  res;
        }
    }
}
