package com.entity.view;

import com.entity.WuliuluxianfenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物流路线分配
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
@TableName("wuliuluxianfenpei")
public class WuliuluxianfenpeiView  extends WuliuluxianfenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuliuluxianfenpeiView(){
	}
 
 	public WuliuluxianfenpeiView(WuliuluxianfenpeiEntity wuliuluxianfenpeiEntity){
 	try {
			BeanUtils.copyProperties(this, wuliuluxianfenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
