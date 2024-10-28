package com.entity.model;

import com.entity.PeisongyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 配送员
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public class PeisongyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
