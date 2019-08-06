package com.mysiteforme.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mysiteforme.admin.entity.MeasureData;
import com.mysiteforme.admin.entity.RoadConditionData;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 测量内容 Mapper 接口
 * </p>
 *
 * @author zengc
 * @since 2019-01-15
 */
public interface RoadConditionDataDao extends BaseMapper<RoadConditionData> {

    List<RoadConditionData> getRoadConditionData(Map<String, String> map);
}
