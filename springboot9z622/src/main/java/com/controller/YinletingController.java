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

import com.entity.YinletingEntity;
import com.entity.view.YinletingView;

import com.service.YinletingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 音乐厅
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
@RestController
@RequestMapping("/yinleting")
public class YinletingController {
    @Autowired
    private YinletingService yinletingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YinletingEntity yinleting,
		HttpServletRequest request){
        EntityWrapper<YinletingEntity> ew = new EntityWrapper<YinletingEntity>();

		PageUtils page = yinletingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinleting), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YinletingEntity yinleting, 
		HttpServletRequest request){
        EntityWrapper<YinletingEntity> ew = new EntityWrapper<YinletingEntity>();

		PageUtils page = yinletingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinleting), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YinletingEntity yinleting){
       	EntityWrapper<YinletingEntity> ew = new EntityWrapper<YinletingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yinleting, "yinleting")); 
        return R.ok().put("data", yinletingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YinletingEntity yinleting){
        EntityWrapper< YinletingEntity> ew = new EntityWrapper< YinletingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yinleting, "yinleting")); 
		YinletingView yinletingView =  yinletingService.selectView(ew);
		return R.ok("查询音乐厅成功").put("data", yinletingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YinletingEntity yinleting = yinletingService.selectById(id);
        return R.ok().put("data", yinleting);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YinletingEntity yinleting = yinletingService.selectById(id);
        return R.ok().put("data", yinleting);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YinletingEntity yinleting, HttpServletRequest request){
    	yinleting.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinleting);
        yinletingService.insert(yinleting);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YinletingEntity yinleting, HttpServletRequest request){
    	yinleting.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinleting);
        yinletingService.insert(yinleting);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YinletingEntity yinleting, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinleting);
        yinletingService.updateById(yinleting);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yinletingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
