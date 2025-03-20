package com.entity.vo;

import com.entity.JiemuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 节目信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public class JiemuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 表演时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date biaoyanshijian;
		
	/**
	 * 歌手
	 */
	
	private String geshou;
		
	/**
	 * 音乐会名称
	 */
	
	private String yinlehuimingcheng;
		
	/**
	 * 节目详情
	 */
	
	private String jiemuxiangqing;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：表演时间
	 */
	 
	public void setBiaoyanshijian(Date biaoyanshijian) {
		this.biaoyanshijian = biaoyanshijian;
	}
	
	/**
	 * 获取：表演时间
	 */
	public Date getBiaoyanshijian() {
		return biaoyanshijian;
	}
				
	
	/**
	 * 设置：歌手
	 */
	 
	public void setGeshou(String geshou) {
		this.geshou = geshou;
	}
	
	/**
	 * 获取：歌手
	 */
	public String getGeshou() {
		return geshou;
	}
				
	
	/**
	 * 设置：音乐会名称
	 */
	 
	public void setYinlehuimingcheng(String yinlehuimingcheng) {
		this.yinlehuimingcheng = yinlehuimingcheng;
	}
	
	/**
	 * 获取：音乐会名称
	 */
	public String getYinlehuimingcheng() {
		return yinlehuimingcheng;
	}
				
	
	/**
	 * 设置：节目详情
	 */
	 
	public void setJiemuxiangqing(String jiemuxiangqing) {
		this.jiemuxiangqing = jiemuxiangqing;
	}
	
	/**
	 * 获取：节目详情
	 */
	public String getJiemuxiangqing() {
		return jiemuxiangqing;
	}
			
}
