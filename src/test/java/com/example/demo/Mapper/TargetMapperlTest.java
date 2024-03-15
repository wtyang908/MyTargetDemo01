package com.example.demo.Mapper;


import com.example.demo.mapper.TargetMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @projectName: MyTarget
 * @package: com.wtyang.mytarget.Service
 * @className: TargetServiceImplTest
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/16 20:55
 * @version: 1.0
 */
@SpringBootTest
public class TargetMapperlTest {

    @Resource
    private TargetMapper targetMapper;

    @Test
    void testQueryByTargetId(){
        System.out.println(targetMapper.queryByTargetId("TTDC00221"));
    }

    @Test
    void testQqueryByIdNameAndSynonyms(){
        System.out.println(targetMapper.queryByIdNameAndSynonyms("T07303"));
    }
}
