package com.entity.view;

import com.entity.CheliangjiaotongguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆交通管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
@TableName("cheliangjiaotongguanli")
public class CheliangjiaotongguanliView  extends CheliangjiaotongguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangjiaotongguanliView(){
	}
 
 	public CheliangjiaotongguanliView(CheliangjiaotongguanliEntity cheliangjiaotongguanliEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangjiaotongguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
