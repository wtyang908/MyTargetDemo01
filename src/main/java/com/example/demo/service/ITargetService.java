package com.example.demo.service;


import com.example.demo.entity.Target;

import java.util.List;

/**
 * @projectName: MyTarget
 * @package: com.wtyang.mytarget.service
 * @className: TargetService
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/16 20:50
 * @version: 1.0
 */
public interface ITargetService {
    Target queryByTargetId(String targetid);

    List<Target> queryByIdNameAndSynonyms(String targetid);
}
