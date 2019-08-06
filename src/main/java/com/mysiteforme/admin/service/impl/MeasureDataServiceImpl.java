package com.mysiteforme.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mysiteforme.admin.dao.MeasureDataDao;
import com.mysiteforme.admin.entity.MeasureData;
import com.mysiteforme.admin.service.MeasureDataService;
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
public class MeasureDataServiceImpl extends ServiceImpl<MeasureDataDao, MeasureData> implements MeasureDataService {


    @Override
    public List<List<Double>> selectMeasureDataByDate(String date) {

        Map<String,Object> map = Maps.newHashMap();
        map.put("date", date);
        List<Map> list =  baseMapper.selectMeasureDataByDate(map);
        
        //List<Double> resultList = Lists.newArrayList();
        List<List<Double>> resultList = Lists.newArrayList();

        for (Map result : list) {
            List<Double> hourResult = Lists.newArrayList();
            hourResult.add(Double.parseDouble(result.get("hour").toString()));
            hourResult.add(Double.parseDouble(result.get("result").toString()));
            //resultList.add(Double.parseDouble(result.get("result").toString()));
            resultList.add(hourResult);
        }

        return resultList;
    }
}
