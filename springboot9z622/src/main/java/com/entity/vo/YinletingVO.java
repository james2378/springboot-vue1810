package com.entity.vo;

import com.entity.YinletingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 音乐厅
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
public class YinletingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 座位数
	 */
	
	private Integer zuoweishu;
		
	/**
	 * 音乐厅状态
	 */
	
	private String yinletingzhuangtai;
				
	
	/**
	 * 设置：座位数
	 */
	 
	public void setZuoweishu(Integer zuoweishu) {
		this.zuoweishu = zuoweishu;
	}
	
	/**
	 * 获取：座位数
	 */
	public Integer getZuoweishu() {
		return zuoweishu;
	}
				
	
	/**
	 * 设置：音乐厅状态
	 */
	 
	public void setYinletingzhuangtai(String yinletingzhuangtai) {
		this.yinletingzhuangtai = yinletingzhuangtai;
	}
	
	/**
	 * 获取：音乐厅状态
	 */
	public String getYinletingzhuangtai() {
		return yinletingzhuangtai;
	}
			
}
