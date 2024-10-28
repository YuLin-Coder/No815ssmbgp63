package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanguanliView;


/**
 * 订单管理
 *
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface DingdanguanliService extends IService<DingdanguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanguanliVO> selectListVO(Wrapper<DingdanguanliEntity> wrapper);
   	
   	DingdanguanliVO selectVO(@Param("ew") Wrapper<DingdanguanliEntity> wrapper);
   	
   	List<DingdanguanliView> selectListView(Wrapper<DingdanguanliEntity> wrapper);
   	
   	DingdanguanliView selectView(@Param("ew") Wrapper<DingdanguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanguanliEntity> wrapper);
   	
}

