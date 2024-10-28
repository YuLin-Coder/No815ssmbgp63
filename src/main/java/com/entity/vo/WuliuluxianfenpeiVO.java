package com.entity.vo;

import com.entity.WuliuluxianfenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 物流路线分配
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public class WuliuluxianfenpeiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
