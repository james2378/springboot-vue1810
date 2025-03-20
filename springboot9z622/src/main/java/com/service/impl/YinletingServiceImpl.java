package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YinletingDao;
import com.entity.YinletingEntity;
import com.service.YinletingService;
import com.entity.vo.YinletingVO;
import com.entity.view.YinletingView;

@Service("yinletingService")
public class YinletingServiceImpl extends ServiceImpl<YinletingDao, YinletingEntity> implements YinletingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinletingEntity> page = this.selectPage(
                new Query<YinletingEntity>(params).getPage(),
                new EntityWrapper<YinletingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinletingEntity> wrapper) {
		  Page<YinletingView> page =new Query<YinletingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinletingVO> selectListVO(Wrapper<YinletingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinletingVO selectVO(Wrapper<YinletingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinletingView> selectListView(Wrapper<YinletingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinletingView selectView(Wrapper<YinletingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
