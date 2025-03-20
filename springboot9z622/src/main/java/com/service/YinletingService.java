package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinletingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinletingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinletingView;


/**
 * 音乐厅
 *
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public interface YinletingService extends IService<YinletingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinletingVO> selectListVO(Wrapper<YinletingEntity> wrapper);
   	
   	YinletingVO selectVO(@Param("ew") Wrapper<YinletingEntity> wrapper);
   	
   	List<YinletingView> selectListView(Wrapper<YinletingEntity> wrapper);
   	
   	YinletingView selectView(@Param("ew") Wrapper<YinletingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinletingEntity> wrapper);
   	

}

