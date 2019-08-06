package com.mysiteforme.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysiteforme.admin.entity.MeasureData;

import java.util.List;

/**
 * <p>
 * 测量数据 服务类
 * </p>
 *
 * @author wangl
 * @since 2018-01-13
 */
public interface MeasureDataService extends IService<MeasureData> {

    public List<List<Double>> selectMeasureDataByDate(String date);

}
