package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinlehuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinlehuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinlehuiView;


/**
 * 音乐会
 *
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public interface YinlehuiService extends IService<YinlehuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinlehuiVO> selectListVO(Wrapper<YinlehuiEntity> wrapper);
   	
   	YinlehuiVO selectVO(@Param("ew") Wrapper<YinlehuiEntity> wrapper);
   	
   	List<YinlehuiView> selectListView(Wrapper<YinlehuiEntity> wrapper);
   	
   	YinlehuiView selectView(@Param("ew") Wrapper<YinlehuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinlehuiEntity> wrapper);
   	

}

