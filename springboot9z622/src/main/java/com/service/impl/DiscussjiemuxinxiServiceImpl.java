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


import com.dao.DiscussjiemuxinxiDao;
import com.entity.DiscussjiemuxinxiEntity;
import com.service.DiscussjiemuxinxiService;
import com.entity.vo.DiscussjiemuxinxiVO;
import com.entity.view.DiscussjiemuxinxiView;

@Service("discussjiemuxinxiService")
public class DiscussjiemuxinxiServiceImpl extends ServiceImpl<DiscussjiemuxinxiDao, DiscussjiemuxinxiEntity> implements DiscussjiemuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiemuxinxiEntity> page = this.selectPage(
                new Query<DiscussjiemuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjiemuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiemuxinxiEntity> wrapper) {
		  Page<DiscussjiemuxinxiView> page =new Query<DiscussjiemuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiemuxinxiVO> selectListVO(Wrapper<DiscussjiemuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiemuxinxiVO selectVO(Wrapper<DiscussjiemuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiemuxinxiView> selectListView(Wrapper<DiscussjiemuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiemuxinxiView selectView(Wrapper<DiscussjiemuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
