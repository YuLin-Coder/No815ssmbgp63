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
 * 车辆交通管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
@TableName("cheliangjiaotongguanli")
public class CheliangjiaotongguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheliangjiaotongguanliEntity() {
		
	}
	
	public CheliangjiaotongguanliEntity(T t) {
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
	 * 车辆类型
	 */
					
	private String cheliangleixing;
	
	/**
	 * 车辆数量
	 */
					
	private Integer cheliangshuliang;
	
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 驾驶人员
	 */
					
	private String jiashirenyuan;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 使用情况
	 */
					
	private String shiyongqingkuang;
	
	
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
	 * 设置：车辆类型
	 */
	public void setCheliangleixing(String cheliangleixing) {
		this.cheliangleixing = cheliangleixing;
	}
	/**
	 * 获取：车辆类型
	 */
	public String getCheliangleixing() {
		return cheliangleixing;
	}
	/**
	 * 设置：车辆数量
	 */
	public void setCheliangshuliang(Integer cheliangshuliang) {
		this.cheliangshuliang = cheliangshuliang;
	}
	/**
	 * 获取：车辆数量
	 */
	public Integer getCheliangshuliang() {
		return cheliangshuliang;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：驾驶人员
	 */
	public void setJiashirenyuan(String jiashirenyuan) {
		this.jiashirenyuan = jiashirenyuan;
	}
	/**
	 * 获取：驾驶人员
	 */
	public String getJiashirenyuan() {
		return jiashirenyuan;
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
	 * 设置：使用情况
	 */
	public void setShiyongqingkuang(String shiyongqingkuang) {
		this.shiyongqingkuang = shiyongqingkuang;
	}
	/**
	 * 获取：使用情况
	 */
	public String getShiyongqingkuang() {
		return shiyongqingkuang;
	}

}
