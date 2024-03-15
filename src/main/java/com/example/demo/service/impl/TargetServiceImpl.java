package com.example.demo.service.impl;


import com.example.demo.Controller.ex.TargetNotFoundException;
import com.example.demo.entity.Target;
import com.example.demo.mapper.TargetMapper;
import com.example.demo.service.ITargetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @projectName: MyTarget
 * @package: com.wtyang.mytarget.service.impl
 * @className: TargetServiceImpl
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/16 20:52
 * @version: 1.0
 */
@Service
public class TargetServiceImpl implements ITargetService {

    @Resource
    private TargetMapper targetMapper;

    @Override
    public Target queryByTargetId(String targetid) {
        Target res = targetMapper.queryByTargetId(targetid);
        if(res ==null){
            throw new TargetNotFoundException("靶点未找到");
        }else {
            return res;
        }
    }

    @Override
    public List<Target> queryByIdNameAndSynonyms(String targetid) {
        List<Target> res=targetMapper.queryByIdNameAndSynonyms(targetid);
        if(res.size()==0){
            throw new TargetNotFoundException("靶点未找到");
        }else {
            return res;
        }
    }
}
