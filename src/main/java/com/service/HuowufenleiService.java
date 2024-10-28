package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuowufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuowufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuowufenleiView;


/**
 * 货物分类
 *
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface HuowufenleiService extends IService<HuowufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowufenleiVO> selectListVO(Wrapper<HuowufenleiEntity> wrapper);
   	
   	HuowufenleiVO selectVO(@Param("ew") Wrapper<HuowufenleiEntity> wrapper);
   	
   	List<HuowufenleiView> selectListView(Wrapper<HuowufenleiEntity> wrapper);
   	
   	HuowufenleiView selectView(@Param("ew") Wrapper<HuowufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowufenleiEntity> wrapper);
   	
}

