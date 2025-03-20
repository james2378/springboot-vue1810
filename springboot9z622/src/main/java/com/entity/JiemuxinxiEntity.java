package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 节目信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-28 20:29:09
 */
@TableName("jiemuxinxi")
public class JiemuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiemuxinxiEntity() {
		
	}
	
	public JiemuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 节目名称
	 */
					
	private String jiemumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：节目名称
	 */
	public void setJiemumingcheng(String jiemumingcheng) {
		this.jiemumingcheng = jiemumingcheng;
	}
	/**
	 * 获取：节目名称
	 */
	public String getJiemumingcheng() {
		return jiemumingcheng;
	}
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
