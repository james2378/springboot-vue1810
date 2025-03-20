package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyinlehuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyinlehuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyinlehuiView;


/**
 * 音乐会评论表
 *
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public interface DiscussyinlehuiService extends IService<DiscussyinlehuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyinlehuiVO> selectListVO(Wrapper<DiscussyinlehuiEntity> wrapper);
   	
   	DiscussyinlehuiVO selectVO(@Param("ew") Wrapper<DiscussyinlehuiEntity> wrapper);
   	
   	List<DiscussyinlehuiView> selectListView(Wrapper<DiscussyinlehuiEntity> wrapper);
   	
   	DiscussyinlehuiView selectView(@Param("ew") Wrapper<DiscussyinlehuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyinlehuiEntity> wrapper);
   	

}

