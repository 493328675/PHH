package com.mysiteforme.admin.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.mysiteforme.admin.base.DataEntity;

import java.math.BigDecimal;

@TableName("road_condition_data")
public class RoadConditionData extends DataEntity<RoadConditionData> {

    private static final long serialVersionUID = 1L;


    private Integer no;

    private String startNo;

    private String endNo;

    private BigDecimal pci;

    private BigDecimal rqi;

    private BigDecimal rdi;

    private BigDecimal sri;


    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getStartNo() {
        return startNo;
    }

    public void setStartNo(String startNo) {
        this.startNo = startNo;
    }

    public String getEndNo() {
        return endNo;
    }

    public void setEndNo(String endNo) {
        this.endNo = endNo;
    }

    public BigDecimal getPci() {
        return pci;
    }

    public void setPci(BigDecimal pci) {
        this.pci = pci;
    }

    public BigDecimal getRqi() {
        return rqi;
    }

    public void setRqi(BigDecimal rqi) {
        this.rqi = rqi;
    }

    public BigDecimal getRdi() {
        return rdi;
    }

    public void setRdi(BigDecimal rdi) {
        this.rdi = rdi;
    }

    public BigDecimal getSri() {
        return sri;
    }

    public void setSri(BigDecimal sri) {
        this.sri = sri;
    }
}
