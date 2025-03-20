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


import com.dao.DiscussyinlehuiDao;
import com.entity.DiscussyinlehuiEntity;
import com.service.DiscussyinlehuiService;
import com.entity.vo.DiscussyinlehuiVO;
import com.entity.view.DiscussyinlehuiView;

@Service("discussyinlehuiService")
public class DiscussyinlehuiServiceImpl extends ServiceImpl<DiscussyinlehuiDao, DiscussyinlehuiEntity> implements DiscussyinlehuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyinlehuiEntity> page = this.selectPage(
                new Query<DiscussyinlehuiEntity>(params).getPage(),
                new EntityWrapper<DiscussyinlehuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyinlehuiEntity> wrapper) {
		  Page<DiscussyinlehuiView> page =new Query<DiscussyinlehuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyinlehuiVO> selectListVO(Wrapper<DiscussyinlehuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyinlehuiVO selectVO(Wrapper<DiscussyinlehuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyinlehuiView> selectListView(Wrapper<DiscussyinlehuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyinlehuiView selectView(Wrapper<DiscussyinlehuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
