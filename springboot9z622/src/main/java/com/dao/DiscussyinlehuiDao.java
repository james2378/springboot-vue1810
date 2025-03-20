package com.dao;

import com.entity.DiscussyinlehuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyinlehuiVO;
import com.entity.view.DiscussyinlehuiView;


/**
 * 音乐会评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public interface DiscussyinlehuiDao extends BaseMapper<DiscussyinlehuiEntity> {
	
	List<DiscussyinlehuiVO> selectListVO(@Param("ew") Wrapper<DiscussyinlehuiEntity> wrapper);
	
	DiscussyinlehuiVO selectVO(@Param("ew") Wrapper<DiscussyinlehuiEntity> wrapper);
	
	List<DiscussyinlehuiView> selectListView(@Param("ew") Wrapper<DiscussyinlehuiEntity> wrapper);

	List<DiscussyinlehuiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyinlehuiEntity> wrapper);
	
	DiscussyinlehuiView selectView(@Param("ew") Wrapper<DiscussyinlehuiEntity> wrapper);
	

}
