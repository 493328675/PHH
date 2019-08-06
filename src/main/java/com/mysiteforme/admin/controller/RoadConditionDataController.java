package com.mysiteforme.admin.controller;

import com.mysiteforme.admin.annotation.SysLog;
import com.mysiteforme.admin.base.BaseController;
import com.mysiteforme.admin.entity.RoadConditionData;
import com.mysiteforme.admin.service.RoadConditionDataService;
import com.mysiteforme.admin.util.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zengc on 2019/1/15.
 * todo:
 */
@Controller
@RequestMapping("admin/road")
public class RoadConditionDataController extends BaseController{
    private static final Logger LOGGER = LoggerFactory.getLogger(RoadConditionDataController.class);



    @PostMapping("getRoadConditionData")
    @ResponseBody
    public RestResponse getRoadConditionData(@RequestParam("start") String start,@RequestParam("end") String end) {
        List<RoadConditionData> data = roadConditionDataService.getRoadConditionData(start,end);

        return RestResponse.success().setData(data);
    }



    @GetMapping("roadCondition")
    @SysLog("跳转路面状况")
    public String roadCondition(){
        return "admin/data/roadCondition";
    }

}
