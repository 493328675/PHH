package com.mysiteforme.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.mysiteforme.admin.entity.BlogArticle;
import com.mysiteforme.admin.entity.MeasureData;

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
public interface MeasureDataDao extends BaseMapper<MeasureData> {

    List<Map> selectMeasureDataByDate(Map<String,Object> map);
}
