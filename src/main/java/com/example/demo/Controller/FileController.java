package com.example.demo.Controller;

import com.example.demo.util.JsonResult;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @projectName: MyTargetDemo
 * @package: com.example.demo.Controller
 * @className: FileController
 * @author: wtyang
 * @description: TODO
 * @date: 2024/1/10 13:38
 * @version: 1.0
 */
@RestController
@RequestMapping("file")
public class FileController extends ExceptionController{

    @GetMapping("/getFile/{fileName}")
    public ResponseEntity<Resource> getPDBFile(@PathVariable("fileName") String fileName) throws FileNotFoundException {
        String absultPath="C:\\software\\pdb_download\\"+fileName+".pdb";
        File file=new File(absultPath);
        FileInputStream fis=new FileInputStream(file);
        InputStreamResource resource=new InputStreamResource(fis);

        // 设置HTTP响应头
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + file.getName());
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE);
        headers.add(HttpHeaders.CONTENT_LENGTH, String.valueOf(file.length()));

        return ResponseEntity.ok()
                             .headers(headers)
                             .contentLength(file.length())
                             .contentType(MediaType.APPLICATION_OCTET_STREAM)
                             .body(resource);
    }
}
