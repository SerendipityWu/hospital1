package demo.service;

import demo.pojo.Hospital;
import demo.pojo.Medical_assay;

import java.util.List;

public interface Medical_assayService {
    List<Medical_assay> findAll(Integer hospital_id);
    int del(int id);
    int update(Medical_assay medical_assay);
    int save(Medical_assay medical_assay);
}
