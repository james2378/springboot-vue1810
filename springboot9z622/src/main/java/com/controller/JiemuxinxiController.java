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

import com.entity.JiemuxinxiEntity;
import com.entity.view.JiemuxinxiView;

import com.service.JiemuxinxiService;
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
 * 节目信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
@RestController
@RequestMapping("/jiemuxinxi")
public class JiemuxinxiController {
    @Autowired
    private JiemuxinxiService jiemuxinxiService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiemuxinxiEntity jiemuxinxi,
		HttpServletRequest request){
        EntityWrapper<JiemuxinxiEntity> ew = new EntityWrapper<JiemuxinxiEntity>();

		PageUtils page = jiemuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiemuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiemuxinxiEntity jiemuxinxi, 
		HttpServletRequest request){
        EntityWrapper<JiemuxinxiEntity> ew = new EntityWrapper<JiemuxinxiEntity>();

		PageUtils page = jiemuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiemuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiemuxinxiEntity jiemuxinxi){
       	EntityWrapper<JiemuxinxiEntity> ew = new EntityWrapper<JiemuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiemuxinxi, "jiemuxinxi")); 
        return R.ok().put("data", jiemuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiemuxinxiEntity jiemuxinxi){
        EntityWrapper< JiemuxinxiEntity> ew = new EntityWrapper< JiemuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiemuxinxi, "jiemuxinxi")); 
		JiemuxinxiView jiemuxinxiView =  jiemuxinxiService.selectView(ew);
		return R.ok("查询节目信息成功").put("data", jiemuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiemuxinxiEntity jiemuxinxi = jiemuxinxiService.selectById(id);
        return R.ok().put("data", jiemuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiemuxinxiEntity jiemuxinxi = jiemuxinxiService.selectById(id);
        return R.ok().put("data", jiemuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiemuxinxiEntity jiemuxinxi, HttpServletRequest request){
    	jiemuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiemuxinxi);
        jiemuxinxiService.insert(jiemuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiemuxinxiEntity jiemuxinxi, HttpServletRequest request){
    	jiemuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiemuxinxi);
        jiemuxinxiService.insert(jiemuxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiemuxinxiEntity jiemuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiemuxinxi);
        jiemuxinxiService.updateById(jiemuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiemuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
