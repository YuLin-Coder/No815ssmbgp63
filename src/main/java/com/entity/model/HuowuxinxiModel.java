package com.entity.model;

import com.entity.HuowuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 货物信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public class HuowuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 售价
	 */
	
	private Integer shoujia;
		
	/**
	 * 进价
	 */
	
	private Integer jinjia;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 合计金额
	 */
	
	private Integer hejijine;
		
	/**
	 * 管理员
	 */
	
	private String guanliyuan;
				
	
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
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：售价
	 */
	 
	public void setShoujia(Integer shoujia) {
		this.shoujia = shoujia;
	}
	
	/**
	 * 获取：售价
	 */
	public Integer getShoujia() {
		return shoujia;
	}
				
	
	/**
	 * 设置：进价
	 */
	 
	public void setJinjia(Integer jinjia) {
		this.jinjia = jinjia;
	}
	
	/**
	 * 获取：进价
	 */
	public Integer getJinjia() {
		return jinjia;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：合计金额
	 */
	 
	public void setHejijine(Integer hejijine) {
		this.hejijine = hejijine;
	}
	
	/**
	 * 获取：合计金额
	 */
	public Integer getHejijine() {
		return hejijine;
	}
				
	
	/**
	 * 设置：管理员
	 */
	 
	public void setGuanliyuan(String guanliyuan) {
		this.guanliyuan = guanliyuan;
	}
	
	/**
	 * 获取：管理员
	 */
	public String getGuanliyuan() {
		return guanliyuan;
	}
			
}
