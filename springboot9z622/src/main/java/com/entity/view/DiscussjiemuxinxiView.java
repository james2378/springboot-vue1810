package com.entity.view;

import com.entity.DiscussjiemuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 节目信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
@TableName("discussjiemuxinxi")
public class DiscussjiemuxinxiView  extends DiscussjiemuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiemuxinxiView(){
	}
 
 	public DiscussjiemuxinxiView(DiscussjiemuxinxiEntity discussjiemuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiemuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
