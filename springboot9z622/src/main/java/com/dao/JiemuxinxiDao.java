package com.dao;

import com.entity.JiemuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiemuxinxiVO;
import com.entity.view.JiemuxinxiView;


/**
 * 节目信息
 * 
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public interface JiemuxinxiDao extends BaseMapper<JiemuxinxiEntity> {
	
	List<JiemuxinxiVO> selectListVO(@Param("ew") Wrapper<JiemuxinxiEntity> wrapper);
	
	JiemuxinxiVO selectVO(@Param("ew") Wrapper<JiemuxinxiEntity> wrapper);
	
	List<JiemuxinxiView> selectListView(@Param("ew") Wrapper<JiemuxinxiEntity> wrapper);

	List<JiemuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiemuxinxiEntity> wrapper);
	
	JiemuxinxiView selectView(@Param("ew") Wrapper<JiemuxinxiEntity> wrapper);
	

}
