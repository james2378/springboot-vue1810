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


import com.dao.YinlehuiDao;
import com.entity.YinlehuiEntity;
import com.service.YinlehuiService;
import com.entity.vo.YinlehuiVO;
import com.entity.view.YinlehuiView;

@Service("yinlehuiService")
public class YinlehuiServiceImpl extends ServiceImpl<YinlehuiDao, YinlehuiEntity> implements YinlehuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinlehuiEntity> page = this.selectPage(
                new Query<YinlehuiEntity>(params).getPage(),
                new EntityWrapper<YinlehuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinlehuiEntity> wrapper) {
		  Page<YinlehuiView> page =new Query<YinlehuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinlehuiVO> selectListVO(Wrapper<YinlehuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinlehuiVO selectVO(Wrapper<YinlehuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinlehuiView> selectListView(Wrapper<YinlehuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinlehuiView selectView(Wrapper<YinlehuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
