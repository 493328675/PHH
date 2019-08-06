package com.mysiteforme.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mysiteforme.admin.dao.MeasureDataDao;
import com.mysiteforme.admin.dao.RoadConditionDataDao;
import com.mysiteforme.admin.entity.MeasureData;
import com.mysiteforme.admin.entity.RoadConditionData;
import com.mysiteforme.admin.service.MeasureDataService;
import com.mysiteforme.admin.service.RoadConditionDataService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 测量数据 服务实现类
 * </p>
 *
 * @author zengc
 * @since 2019-01-15
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoadConditionDataServiceImpl extends ServiceImpl<RoadConditionDataDao, RoadConditionData> implements RoadConditionDataService {


    @Override
    public List<RoadConditionData> getRoadConditionData(String start, String end) {

        Map<String,String> map = Maps.newHashMap();
        map.put("start", start);
        map.put("end", end);
        List<RoadConditionData> list =  baseMapper.getRoadConditionData(map);

        return list;
    }
}
