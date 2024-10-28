package com.entity.view;

import com.entity.HuowufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 货物分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
@TableName("huowufenlei")
public class HuowufenleiView  extends HuowufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuowufenleiView(){
	}
 
 	public HuowufenleiView(HuowufenleiEntity huowufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, huowufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
