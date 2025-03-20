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

import com.entity.DiscussjiemuxinxiEntity;
import com.entity.view.DiscussjiemuxinxiView;

import com.service.DiscussjiemuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 节目信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
@RestController
@RequestMapping("/discussjiemuxinxi")
public class DiscussjiemuxinxiController {
    @Autowired
    private DiscussjiemuxinxiService discussjiemuxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussjiemuxinxiEntity discussjiemuxinxi,
		HttpServletRequest request){
        EntityWrapper<DiscussjiemuxinxiEntity> ew = new EntityWrapper<DiscussjiemuxinxiEntity>();

		PageUtils page = discussjiemuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussjiemuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussjiemuxinxiEntity discussjiemuxinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscussjiemuxinxiEntity> ew = new EntityWrapper<DiscussjiemuxinxiEntity>();

		PageUtils page = discussjiemuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussjiemuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussjiemuxinxiEntity discussjiemuxinxi){
       	EntityWrapper<DiscussjiemuxinxiEntity> ew = new EntityWrapper<DiscussjiemuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussjiemuxinxi, "discussjiemuxinxi")); 
        return R.ok().put("data", discussjiemuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussjiemuxinxiEntity discussjiemuxinxi){
        EntityWrapper< DiscussjiemuxinxiEntity> ew = new EntityWrapper< DiscussjiemuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussjiemuxinxi, "discussjiemuxinxi")); 
		DiscussjiemuxinxiView discussjiemuxinxiView =  discussjiemuxinxiService.selectView(ew);
		return R.ok("查询节目信息评论表成功").put("data", discussjiemuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussjiemuxinxiEntity discussjiemuxinxi = discussjiemuxinxiService.selectById(id);
        return R.ok().put("data", discussjiemuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussjiemuxinxiEntity discussjiemuxinxi = discussjiemuxinxiService.selectById(id);
        return R.ok().put("data", discussjiemuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussjiemuxinxiEntity discussjiemuxinxi, HttpServletRequest request){
    	discussjiemuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussjiemuxinxi);
        discussjiemuxinxiService.insert(discussjiemuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussjiemuxinxiEntity discussjiemuxinxi, HttpServletRequest request){
    	discussjiemuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussjiemuxinxi);
        discussjiemuxinxiService.insert(discussjiemuxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussjiemuxinxiEntity discussjiemuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussjiemuxinxi);
        discussjiemuxinxiService.updateById(discussjiemuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussjiemuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
