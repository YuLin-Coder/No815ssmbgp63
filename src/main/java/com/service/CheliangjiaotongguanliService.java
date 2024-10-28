package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangjiaotongguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangjiaotongguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangjiaotongguanliView;


/**
 * 车辆交通管理
 *
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface CheliangjiaotongguanliService extends IService<CheliangjiaotongguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangjiaotongguanliVO> selectListVO(Wrapper<CheliangjiaotongguanliEntity> wrapper);
   	
   	CheliangjiaotongguanliVO selectVO(@Param("ew") Wrapper<CheliangjiaotongguanliEntity> wrapper);
   	
   	List<CheliangjiaotongguanliView> selectListView(Wrapper<CheliangjiaotongguanliEntity> wrapper);
   	
   	CheliangjiaotongguanliView selectView(@Param("ew") Wrapper<CheliangjiaotongguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangjiaotongguanliEntity> wrapper);
   	
}

