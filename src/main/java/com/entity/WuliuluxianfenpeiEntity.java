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
 * 物流路线分配
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
@TableName("wuliuluxianfenpei")
public class WuliuluxianfenpeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuliuluxianfenpeiEntity() {
		
	}
	
	public WuliuluxianfenpeiEntity(T t) {
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
	 * 路线名称
	 */
					
	private String luxianmingcheng;
	
	/**
	 * 路线分类
	 */
					
	private String luxianfenlei;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 车辆
	 */
					
	private String cheliang;
	
	/**
	 * 配送员姓名
	 */
					
	private String peisongyuanxingming;
	
	/**
	 * 配送员编号
	 */
					
	private String peisongyuanbianhao;
	
	/**
	 * 配送员电话
	 */
					
	private String peisongyuandianhua;
	
	/**
	 * 上班时间
	 */
					
	private String shangbanshijian;
	
	
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
	 * 设置：路线名称
	 */
	public void setLuxianmingcheng(String luxianmingcheng) {
		this.luxianmingcheng = luxianmingcheng;
	}
	/**
	 * 获取：路线名称
	 */
	public String getLuxianmingcheng() {
		return luxianmingcheng;
	}
	/**
	 * 设置：路线分类
	 */
	public void setLuxianfenlei(String luxianfenlei) {
		this.luxianfenlei = luxianfenlei;
	}
	/**
	 * 获取：路线分类
	 */
	public String getLuxianfenlei() {
		return luxianfenlei;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：车辆
	 */
	public void setCheliang(String cheliang) {
		this.cheliang = cheliang;
	}
	/**
	 * 获取：车辆
	 */
	public String getCheliang() {
		return cheliang;
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

}
