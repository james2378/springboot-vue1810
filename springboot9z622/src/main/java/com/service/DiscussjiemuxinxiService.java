package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiemuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiemuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiemuxinxiView;


/**
 * 节目信息评论表
 *
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public interface DiscussjiemuxinxiService extends IService<DiscussjiemuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiemuxinxiVO> selectListVO(Wrapper<DiscussjiemuxinxiEntity> wrapper);
   	
   	DiscussjiemuxinxiVO selectVO(@Param("ew") Wrapper<DiscussjiemuxinxiEntity> wrapper);
   	
   	List<DiscussjiemuxinxiView> selectListView(Wrapper<DiscussjiemuxinxiEntity> wrapper);
   	
   	DiscussjiemuxinxiView selectView(@Param("ew") Wrapper<DiscussjiemuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiemuxinxiEntity> wrapper);
   	

}

