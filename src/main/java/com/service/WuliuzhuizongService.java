package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuliuzhuizongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuliuzhuizongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuliuzhuizongView;


/**
 * 物流追踪
 *
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface WuliuzhuizongService extends IService<WuliuzhuizongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuliuzhuizongVO> selectListVO(Wrapper<WuliuzhuizongEntity> wrapper);
   	
   	WuliuzhuizongVO selectVO(@Param("ew") Wrapper<WuliuzhuizongEntity> wrapper);
   	
   	List<WuliuzhuizongView> selectListView(Wrapper<WuliuzhuizongEntity> wrapper);
   	
   	WuliuzhuizongView selectView(@Param("ew") Wrapper<WuliuzhuizongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuliuzhuizongEntity> wrapper);
   	
}

