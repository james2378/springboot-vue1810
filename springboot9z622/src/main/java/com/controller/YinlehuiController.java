package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YinlehuiEntity;
import com.entity.view.YinlehuiView;

import com.service.YinlehuiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 音乐会
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
@RestController
@RequestMapping("/yinlehui")
public class YinlehuiController {
    @Autowired
    private YinlehuiService yinlehuiService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YinlehuiEntity yinlehui,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date yanchushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date yanchushijianend,
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<YinlehuiEntity> ew = new EntityWrapper<YinlehuiEntity>();
                if(yanchushijianstart!=null) ew.ge("yanchushijian", yanchushijianstart);
                if(yanchushijianend!=null) ew.le("yanchushijian", yanchushijianend);
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = yinlehuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlehui), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YinlehuiEntity yinlehui, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date yanchushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date yanchushijianend,
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<YinlehuiEntity> ew = new EntityWrapper<YinlehuiEntity>();
                if(yanchushijianstart!=null) ew.ge("yanchushijian", yanchushijianstart);
                if(yanchushijianend!=null) ew.le("yanchushijian", yanchushijianend);
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = yinlehuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlehui), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YinlehuiEntity yinlehui){
       	EntityWrapper<YinlehuiEntity> ew = new EntityWrapper<YinlehuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yinlehui, "yinlehui")); 
        return R.ok().put("data", yinlehuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YinlehuiEntity yinlehui){
        EntityWrapper< YinlehuiEntity> ew = new EntityWrapper< YinlehuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yinlehui, "yinlehui")); 
		YinlehuiView yinlehuiView =  yinlehuiService.selectView(ew);
		return R.ok("查询音乐会成功").put("data", yinlehuiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YinlehuiEntity yinlehui = yinlehuiService.selectById(id);
		yinlehui.setClicknum(yinlehui.getClicknum()+1);
		yinlehui.setClicktime(new Date());
		yinlehuiService.updateById(yinlehui);
        return R.ok().put("data", yinlehui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YinlehuiEntity yinlehui = yinlehuiService.selectById(id);
		yinlehui.setClicknum(yinlehui.getClicknum()+1);
		yinlehui.setClicktime(new Date());
		yinlehuiService.updateById(yinlehui);
        return R.ok().put("data", yinlehui);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        YinlehuiEntity yinlehui = yinlehuiService.selectById(id);
        if(type.equals("1")) {
        	yinlehui.setThumbsupnum(yinlehui.getThumbsupnum()+1);
        } else {
        	yinlehui.setCrazilynum(yinlehui.getCrazilynum()+1);
        }
        yinlehuiService.updateById(yinlehui);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YinlehuiEntity yinlehui, HttpServletRequest request){
    	yinlehui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinlehui);
        yinlehuiService.insert(yinlehui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YinlehuiEntity yinlehui, HttpServletRequest request){
    	yinlehui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinlehui);
        yinlehuiService.insert(yinlehui);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YinlehuiEntity yinlehui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinlehui);
        yinlehuiService.updateById(yinlehui);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yinlehuiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,YinlehuiEntity yinlehui, HttpServletRequest request,String pre){
        EntityWrapper<YinlehuiEntity> ew = new EntityWrapper<YinlehuiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = yinlehuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlehui), params), params));
        return R.ok().put("data", page);
    }









}
