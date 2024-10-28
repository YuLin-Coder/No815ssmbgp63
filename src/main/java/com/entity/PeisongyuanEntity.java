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
 * 配送员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
@TableName("peisongyuan")
public class PeisongyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeisongyuanEntity() {
		
	}
	
	public PeisongyuanEntity(T t) {
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
	 * 配送员编号
	 */
					
	private String peisongyuanbianhao;
	
	/**
	 * 配送员姓名
	 */
					
	private String peisongyuanxingming;
	
	/**
	 * 配送员电话
	 */
					
	private String peisongyuandianhua;
	
	/**
	 * 配送员照片
	 */
					
	private String peisongyuanzhaopian;
	
	/**
	 * 配送员状态
	 */
					
	private String peisongyuanzhuangtai;
	
	/**
	 * 上班时间
	 */
					
	private String shangbanshijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：配送员编号
	 */
	public void setPeisongyuanbianhao(String peisongyuanbianhao) {
		this.peisongyuanbianhao = peisongyuanbianhao;
	}
	/**
	 * 获取：配送员编号
	 */
	public String getPeisongyuanbianhao() {
		return peisongyuanbianhao;
	}
	/**
	 * 设置：配送员姓名
	 */
	public void setPeisongyuanxingming(String peisongyuanxingming) {
		this.peisongyuanxingming = peisongyuanxingming;
	}
	/**
	 * 获取：配送员姓名
	 */
	public String getPeisongyuanxingming() {
		return peisongyuanxingming;
	}
	/**
	 * 设置：配送员电话
	 */
	public void setPeisongyuandianhua(String peisongyuandianhua) {
		this.peisongyuandianhua = peisongyuandianhua;
	}
	/**
	 * 获取：配送员电话
	 */
	public String getPeisongyuandianhua() {
		return peisongyuandianhua;
	}
	/**
	 * 设置：配送员照片
	 */
	public void setPeisongyuanzhaopian(String peisongyuanzhaopian) {
		this.peisongyuanzhaopian = peisongyuanzhaopian;
	}
	/**
	 * 获取：配送员照片
	 */
	public String getPeisongyuanzhaopian() {
		return peisongyuanzhaopian;
	}
	/**
	 * 设置：配送员状态
	 */
	public void setPeisongyuanzhuangtai(String peisongyuanzhuangtai) {
		this.peisongyuanzhuangtai = peisongyuanzhuangtai;
	}
	/**
	 * 获取：配送员状态
	 */
	public String getPeisongyuanzhuangtai() {
		return peisongyuanzhuangtai;
	}
	/**
	 * 设置：上班时间
	 */
	public void setShangbanshijian(String shangbanshijian) {
		this.shangbanshijian = shangbanshijian;
	}
	/**
	 * 获取：上班时间
	 */
	public String getShangbanshijian() {
		return shangbanshijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
