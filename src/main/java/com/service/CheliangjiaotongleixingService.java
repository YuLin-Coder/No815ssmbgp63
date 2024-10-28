package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangjiaotongleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangjiaotongleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangjiaotongleixingView;


/**
 * 车辆交通类型
 *
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface CheliangjiaotongleixingService extends IService<CheliangjiaotongleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangjiaotongleixingVO> selectListVO(Wrapper<CheliangjiaotongleixingEntity> wrapper);
   	
   	CheliangjiaotongleixingVO selectVO(@Param("ew") Wrapper<CheliangjiaotongleixingEntity> wrapper);
   	
   	List<CheliangjiaotongleixingView> selectListView(Wrapper<CheliangjiaotongleixingEntity> wrapper);
   	
   	CheliangjiaotongleixingView selectView(@Param("ew") Wrapper<CheliangjiaotongleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangjiaotongleixingEntity> wrapper);
   	
}

