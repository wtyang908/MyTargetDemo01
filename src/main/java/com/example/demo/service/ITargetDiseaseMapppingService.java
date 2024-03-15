package com.example.demo.service;

import com.example.demo.entity.TargetDiseaseMappping;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.service
 * @className: TargetDiseaseMapppingService
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/18 14:28
 * @version: 1.0
 */
public interface ITargetDiseaseMapppingService {
    TargetDiseaseMappping queryByTargetId(String targetid);
}
