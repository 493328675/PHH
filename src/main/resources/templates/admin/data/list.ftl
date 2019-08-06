<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${base}/static/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="//at.alicdn.com/t/font_tnyc012u2rlwstt9.css" media="all" />
    <link rel="stylesheet" href="${base}/static/css/main.css" media="all" />
</head>
<body class="childrenBody">
<fieldset class="layui-elem-field">
    <legend>数据库管理</legend>
    <div class="layui-field-box">
        <form class="layui-form">
            <div class="layui-inline">
                <label class="layui-form-label">请选择日期</label>
                <div class="layui-input-inline">
                    <input type="text" class="layui-input" id="test1" placeholder="yyyy-MM-dd">
                </div>
            </div>
            <div class="layui-inline">
                <a class="layui-btn"  lay-submit="" lay-filter="searchForm">查询</a>
            </div>
        </form>
    </div>
</fieldset>
<div class="row">
    <div id="container" style="height: 500px"></div>
    <script type="text/javascript" src="${base}/static/js/jquery.min.js"></script>
    <#--<script type="text/javascript" src="${base}/static/js/echarts.min.js"></script>-->
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts-all-3.js"></script>
    <script type="text/javascript">
        var dom = document.getElementById("container");
        var myChart = echarts.init(dom);




    </script>
</div>


<script type="text/javascript" src="${base}/static/layui/layui.js"></script>
<script>
    layui.use(['layer','jquery','form','laydate'],function(){


        var laydate = layui.laydate;
        laydate.render({
            elem: '#test1'
        });

        var layer = layui.layer,
                $ = layui.jquery,
                form = layui.form;

        $(".panel a").on("click",function(){
            window.parent.addTab($(this));
        });


        //搜索
        form.on("submit(searchForm)",function(data){
            console.log(data);
            $.post('${base}/admin/data/getMeasureDataByDay',data.field,function (res) {
                console.log(res);
                if (res.success) {
                    myChart.setOption({
                        tooltip: {
                            trigger: 'axis',
                            showDelay : 0,

                            axisPointer:{
                                show: true,
                                type : 'cross',
                                lineStyle: {
                                    type : 'dashed',
                                    width : 1
                                }
                            }
                        },
                        legend: {
                            data:['2018-06-01']
                        },
                        toolbox: {
                            show : true,
                            feature : {
                                mark : {show: true},
                                dataZoom : {show: true},
                                dataView : {show: true, readOnly: false},
                                restore : {show: true},
                                saveAsImage : {show: true}
                            }
                        },
                        xAxis : [
                            {
                                type : 'value',
                                scale:true,
                                axisLabel : {
                                    formatter: '{value} 时'
                                }
                            }
                        ],
                        yAxis : [
                            {
                                type : 'value',
                                scale:true,
                                axisLabel : {
                                    formatter: '{value} 单位'
                                }
                            }
                        ],
                        series: [{
                            data: res.data,
                            type: 'scatter',
                            name: '2018-06-01',
                            markPoint: {
                                data: [
                                    {type: 'max', name: '最大值'},
                                    {type: 'min', name: '最小值'}
                                ]
                            },
                            markLine : {
                                data : [
                                    {type : 'average', name: '平均值'}
                                ]
                            }
                        }]
                    });
                } else {
                    layer.msg("请求失败！");
                }

            });
        });
    });
</script>
</body>
</html>