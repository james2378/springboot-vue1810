package com.dao;

import com.entity.YinlehuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinlehuiVO;
import com.entity.view.YinlehuiView;


/**
 * 音乐会
 * 
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public interface YinlehuiDao extends BaseMapper<YinlehuiEntity> {
	
	List<YinlehuiVO> selectListVO(@Param("ew") Wrapper<YinlehuiEntity> wrapper);
	
	YinlehuiVO selectVO(@Param("ew") Wrapper<YinlehuiEntity> wrapper);
	
	List<YinlehuiView> selectListView(@Param("ew") Wrapper<YinlehuiEntity> wrapper);

	List<YinlehuiView> selectListView(Pagination page,@Param("ew") Wrapper<YinlehuiEntity> wrapper);
	
	YinlehuiView selectView(@Param("ew") Wrapper<YinlehuiEntity> wrapper);
	

}
