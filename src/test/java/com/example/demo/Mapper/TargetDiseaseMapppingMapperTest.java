package com.example.demo.Mapper;

import com.example.demo.mapper.TargetDiseaseMapppingMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.Mapper
 * @className: TargetDiseaseMapppingMapperTest
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/18 14:20
 * @version: 1.0
 */
@SpringBootTest
public class TargetDiseaseMapppingMapperTest {

    @Resource
    private TargetDiseaseMapppingMapper targetDiseaseMapppingMapper;

    @Test
    void testqueryByTargetId(){
        targetDiseaseMapppingMapper.queryByTargetId("q");
    }
}
