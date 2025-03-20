package com.dao;

import com.entity.YinletingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinletingVO;
import com.entity.view.YinletingView;


/**
 * 音乐厅
 * 
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public interface YinletingDao extends BaseMapper<YinletingEntity> {
	
	List<YinletingVO> selectListVO(@Param("ew") Wrapper<YinletingEntity> wrapper);
	
	YinletingVO selectVO(@Param("ew") Wrapper<YinletingEntity> wrapper);
	
	List<YinletingView> selectListView(@Param("ew") Wrapper<YinletingEntity> wrapper);

	List<YinletingView> selectListView(Pagination page,@Param("ew") Wrapper<YinletingEntity> wrapper);
	
	YinletingView selectView(@Param("ew") Wrapper<YinletingEntity> wrapper);
	

}
