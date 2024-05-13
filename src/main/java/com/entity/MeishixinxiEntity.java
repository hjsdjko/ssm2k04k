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
 * 美食信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-21 10:49:29
 */
@TableName("meishixinxi")
public class MeishixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MeishixinxiEntity() {
		
	}
	
	public MeishixinxiEntity(T t) {
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
	 * 美食名称
	 */
					
	private String meishimingcheng;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 口味
	 */
					
	private String kouwei;
	
	/**
	 * 特色
	 */
					
	private String tese;
	
	/**
	 * 视频
	 */
					
	private String shipin;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：美食名称
	 */
	public void setMeishimingcheng(String meishimingcheng) {
		this.meishimingcheng = meishimingcheng;
	}
	/**
	 * 获取：美食名称
	 */
	public String getMeishimingcheng() {
		return meishimingcheng;
	}
	/**
	 * 设置：分类
	 */
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：口味
	 */
	public void setKouwei(String kouwei) {
		this.kouwei = kouwei;
	}
	/**
	 * 获取：口味
	 */
	public String getKouwei() {
		return kouwei;
	}
	/**
	 * 设置：特色
	 */
	public void setTese(String tese) {
		this.tese = tese;
	}
	/**
	 * 获取：特色
	 */
	public String getTese() {
		return tese;
	}
	/**
	 * 设置：视频
	 */
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
