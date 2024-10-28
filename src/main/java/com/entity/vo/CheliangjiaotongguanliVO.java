package com.entity.vo;

import com.entity.CheliangjiaotongguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 车辆交通管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public class CheliangjiaotongguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
