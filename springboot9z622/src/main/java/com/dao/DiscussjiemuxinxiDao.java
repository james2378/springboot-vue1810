package com.dao;

import com.entity.DiscussjiemuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiemuxinxiVO;
import com.entity.view.DiscussjiemuxinxiView;


/**
 * 节目信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public interface DiscussjiemuxinxiDao extends BaseMapper<DiscussjiemuxinxiEntity> {
	
	List<DiscussjiemuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjiemuxinxiEntity> wrapper);
	
	DiscussjiemuxinxiVO selectVO(@Param("ew") Wrapper<DiscussjiemuxinxiEntity> wrapper);
	
	List<DiscussjiemuxinxiView> selectListView(@Param("ew") Wrapper<DiscussjiemuxinxiEntity> wrapper);

	List<DiscussjiemuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiemuxinxiEntity> wrapper);
	
	DiscussjiemuxinxiView selectView(@Param("ew") Wrapper<DiscussjiemuxinxiEntity> wrapper);
	

}
