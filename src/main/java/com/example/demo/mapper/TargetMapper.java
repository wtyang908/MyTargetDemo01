package com.example.demo.mapper;


import com.example.demo.entity.Target;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @projectName: MyTarget
 * @package: com.wtyang.mytarget.mapper
 * @className: TargetMapper
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/16 20:31
 * @version: 1.0
 */

@Mapper
public interface TargetMapper {
    Target queryByTargetId(String targetid);

    List<Target> queryByIdNameAndSynonyms(String targetid);
}
