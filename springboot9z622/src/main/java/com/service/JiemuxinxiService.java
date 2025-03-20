package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiemuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiemuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiemuxinxiView;


/**
 * 节目信息
 *
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public interface JiemuxinxiService extends IService<JiemuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiemuxinxiVO> selectListVO(Wrapper<JiemuxinxiEntity> wrapper);
   	
   	JiemuxinxiVO selectVO(@Param("ew") Wrapper<JiemuxinxiEntity> wrapper);
   	
   	List<JiemuxinxiView> selectListView(Wrapper<JiemuxinxiEntity> wrapper);
   	
   	JiemuxinxiView selectView(@Param("ew") Wrapper<JiemuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiemuxinxiEntity> wrapper);
   	

}

