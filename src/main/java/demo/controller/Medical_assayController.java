package demo.controller;

import demo.pojo.Medical_assay;
import demo.service.HospitalService;
import demo.service.Medical_assayService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Medical_assayController {
    @Resource
    HospitalService hospitalService;
    @Resource
    Medical_assayService medical_assayService;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "id",defaultValue = "0") Integer id, Model model){
        List<Medical_assay> list = medical_assayService.findAll(id);
        model.addAttribute("list",list);
        model.addAttribute("ids",id);
        return "list";
    }
    @RequestMapping("/del/{id}")
    @ResponseBody
    public Object del(@PathVariable Integer id){
        Boolean us=false;
        int del = medical_assayService.del(id);
        if (del>0){
            us=true;
        }
        return us;
    }

    @RequestMapping("/update/{id}")
    @ResponseBody
    public Object update(@PathVariable Integer id,Medical_assay medical_assay){
        medical_assay.setId(id);
        int update = medical_assayService.update(medical_assay);
        boolean us=false;
        if (update>0){
           us=true;
        }
        return us;
    }
    @RequestMapping("/add")
    public String add(Medical_assay medical_assay){
        int update = medical_assayService.save(medical_assay);
        if (update>0){
            return "redirect:/list";
        }else{
            return "xz";
        }
    }

    @RequestMapping("/all")
    @ResponseBody
    @Cacheable(value = "hospital")
    public Object all(){
        return hospitalService.findAll();
    }

    @RequestMapping("/to")
    public String to(){
        return "xz";
    }
}
