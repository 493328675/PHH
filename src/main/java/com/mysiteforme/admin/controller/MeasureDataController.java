package com.mysiteforme.admin.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.mysiteforme.admin.annotation.SysLog;
import com.mysiteforme.admin.base.BaseController;
import com.mysiteforme.admin.entity.Log;
import com.mysiteforme.admin.entity.MeasureData;
import com.mysiteforme.admin.util.LayerData;
import com.mysiteforme.admin.util.RestResponse;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;

import javax.servlet.ServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by zengc on 2019/1/15.
 * todo:
 */
@Controller
@RequestMapping("admin/data")
public class MeasureDataController extends BaseController{
    private static final Logger LOGGER = LoggerFactory.getLogger(MeasureDataController.class);

    @PostMapping("getMeasureDataByDay")
    @ResponseBody
    public RestResponse getMeasureDataByDay(@RequestParam("date") String date) {
        List<List<Double>> data = measureDataService.selectMeasureDataByDate(date);
        return RestResponse.success().setData(data);
    }

    @GetMapping("list")
    @SysLog("跳转数据统计页面")
    public String list(){
        return "admin/data/list";
    }

}
