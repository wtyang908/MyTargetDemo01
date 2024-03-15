package com.example.demo.mapper;

import com.example.demo.entity.Target;
import com.example.demo.entity.TargetDiseaseMappping;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.mapper
 * @className: TargetDiseaseMapppingMapper
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/18 13:49
 * @version: 1.0
 */
@Mapper
public interface TargetDiseaseMapppingMapper {
    TargetDiseaseMappping queryByTargetId(String targetid);
}
