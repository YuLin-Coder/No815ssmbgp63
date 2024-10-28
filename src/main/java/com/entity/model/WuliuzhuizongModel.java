package com.entity.model;

import com.entity.WuliuzhuizongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 物流追踪
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public class WuliuzhuizongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 运输状态
	 */
	
	private String yunshuzhuangtai;
		
	/**
	 * 运输中
	 */
	
	private String yunshuzhong;
		
	/**
	 * 运输路线
	 */
	
	private String yunshuluxian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 收货地址
	 */
	
	private String shouhuodizhi;
				
	
	/**
	 * 设置：运输状态
	 */
	 
	public void setYunshuzhuangtai(String yunshuzhuangtai) {
		this.yunshuzhuangtai = yunshuzhuangtai;
	}
	
	/**
	 * 获取：运输状态
	 */
	public String getYunshuzhuangtai() {
		return yunshuzhuangtai;
	}
				
	
	/**
	 * 设置：运输中
	 */
	 
	public void setYunshuzhong(String yunshuzhong) {
		this.yunshuzhong = yunshuzhong;
	}
	
	/**
	 * 获取：运输中
	 */
	public String getYunshuzhong() {
		return yunshuzhong;
	}
				
	
	/**
	 * 设置：运输路线
	 */
	 
	public void setYunshuluxian(String yunshuluxian) {
		this.yunshuluxian = yunshuluxian;
	}
	
	/**
	 * 获取：运输路线
	 */
	public String getYunshuluxian() {
		return yunshuluxian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：收货地址
	 */
	 
	public void setShouhuodizhi(String shouhuodizhi) {
		this.shouhuodizhi = shouhuodizhi;
	}
	
	/**
	 * 获取：收货地址
	 */
	public String getShouhuodizhi() {
		return shouhuodizhi;
	}
			
}
