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


import com.dao.JiemuxinxiDao;
import com.entity.JiemuxinxiEntity;
import com.service.JiemuxinxiService;
import com.entity.vo.JiemuxinxiVO;
import com.entity.view.JiemuxinxiView;

@Service("jiemuxinxiService")
public class JiemuxinxiServiceImpl extends ServiceImpl<JiemuxinxiDao, JiemuxinxiEntity> implements JiemuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiemuxinxiEntity> page = this.selectPage(
                new Query<JiemuxinxiEntity>(params).getPage(),
                new EntityWrapper<JiemuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiemuxinxiEntity> wrapper) {
		  Page<JiemuxinxiView> page =new Query<JiemuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiemuxinxiVO> selectListVO(Wrapper<JiemuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiemuxinxiVO selectVO(Wrapper<JiemuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiemuxinxiView> selectListView(Wrapper<JiemuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiemuxinxiView selectView(Wrapper<JiemuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
