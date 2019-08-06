package com.mysiteforme.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysiteforme.admin.entity.RoadConditionData;

import java.util.List;

/**
 * <p>
 * 测量数据 服务类
 * </p>
 *
 * @author wangl
 * @since 2018-01-13
 */
public interface RoadConditionDataService extends IService<RoadConditionData> {

    List<RoadConditionData> getRoadConditionData(String start, String end);
}
