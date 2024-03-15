package com.example.demo.Service;

import com.example.demo.service.impl.TargetDiseaseMapppingServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.Service
 * @className: TargetDiseaseMapppingServiceTest
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/18 14:27
 * @version: 1.0
 */
@SpringBootTest
public class TargetDiseaseMapppingServiceTest {
    @Resource
    private TargetDiseaseMapppingServiceImpl targetDiseaseMapppingService;
    @Test
    void testQueryByTargetId(){
        targetDiseaseMapppingService.queryByTargetId("q");
    }
}
