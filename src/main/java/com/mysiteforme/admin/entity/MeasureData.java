package com.mysiteforme.admin.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.google.common.collect.Sets;
import com.mysiteforme.admin.base.DataEntity;

import java.util.Date;
import java.util.Set;

/**
 * <p>
 * 
 * </p>
 *
 * @author zengc
 * @since 2019-01-15
 */
@TableName("measure_data")
public class MeasureData extends DataEntity<MeasureData> {

    private static final long serialVersionUID = 1L;

	/*测量时间*/
    private Date measureTime;

    /*模块地址*/
	private String moduleAddress;

	/*通道号*/
	private Integer channelNumber;

	/*结果*/
	private Long result;

	/*位置名称*/
	private String locationName;

	/*安装位置*/
	private String installLocation;

	/*传感器名称*/
	private String sensorName;


    public Date getMeasureTime() {
        return measureTime;
    }

    public void setMeasureTime(Date measureTime) {
        this.measureTime = measureTime;
    }

    public String getModuleAddress() {
        return moduleAddress;
    }

    public void setModuleAddress(String moduleAddress) {
        this.moduleAddress = moduleAddress;
    }

    public Integer getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(Integer channelNumber) {
        this.channelNumber = channelNumber;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(String installLocation) {
        this.installLocation = installLocation;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }
}
