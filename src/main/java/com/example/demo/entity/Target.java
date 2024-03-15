package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @projectName: MyTarget
 * @package: com.wtyang.mytarget.entity
 * @className: target
 * @author: wtyang
 * @description: TODO
 * @date: 2023/12/16 20:16
 * @version: 1.0
 */
@Data
public class Target implements Serializable {
    private  String targetid;
    private  String formerid;
    private  String uniproid;
    private  String targname;
    private  String genename;
    private  String targtype;
    private  String synonyms;
    private  String functions;
    private  String pdbstruc;
    private  String bioclass;
    private  String ecnumber;
    private  String sequence;
    private  String druginfo;
    private  String keggpath;
    private  String wikipath;
    private  String whizpath;
    private  String reacpath;
    private  String net_path;
    private  String intepath;
    private  String pantpath;
    private  String biocpath;
}
