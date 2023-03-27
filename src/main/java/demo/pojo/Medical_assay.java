package demo.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Medical_assay {
    private Integer id;
    private String assay_user;
    private Integer hospital_id;
    private Integer assay_result;
    private String phone;
    private String card_num;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date assay_time;
    private String hospitalName;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssay_user() {
        return assay_user;
    }

    public void setAssay_user(String assay_user) {
        this.assay_user = assay_user;
    }

    public Integer getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(Integer hospital_id) {
        this.hospital_id = hospital_id;
    }

    public Integer getAssay_result() {
        return assay_result;
    }

    public void setAssay_result(Integer assay_result) {
        this.assay_result = assay_result;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCard_num() {
        return card_num;
    }

    public void setCard_num(String card_num) {
        this.card_num = card_num;
    }

    public Date getAssay_time() {
        return assay_time;
    }

    public void setAssay_time(Date assay_time) {
        this.assay_time = assay_time;
    }
}
