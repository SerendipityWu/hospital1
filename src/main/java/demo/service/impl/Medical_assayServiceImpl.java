package demo.service.impl;

import demo.mapper.medical_assay.Medical_assayMapper;
import demo.service.Medical_assayService;
import demo.pojo.Hospital;
import demo.pojo.Medical_assay;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional(rollbackFor = {Exception.class})
public class Medical_assayServiceImpl implements Medical_assayService {
    @Resource
    Medical_assayMapper medical_assayMapper;
    @Override
    @Transactional(readOnly = true)
    public List<Medical_assay> findAll(Integer hospital_id) {
        return medical_assayMapper.findAll(hospital_id);
    }

    @Override
    public int del(int id) {
        return medical_assayMapper.del(id);
    }

    @Override
    public int update(Medical_assay medical_assay) {
        return medical_assayMapper.update(medical_assay);
    }

    @Override
    public int save(Medical_assay medical_assay) {
        return medical_assayMapper.save(medical_assay);
    }
}
