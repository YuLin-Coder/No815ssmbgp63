package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuliuluxianfenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuliuluxianfenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuliuluxianfenpeiView;


/**
 * 物流路线分配
 *
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface WuliuluxianfenpeiService extends IService<WuliuluxianfenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuliuluxianfenpeiVO> selectListVO(Wrapper<WuliuluxianfenpeiEntity> wrapper);
   	
   	WuliuluxianfenpeiVO selectVO(@Param("ew") Wrapper<WuliuluxianfenpeiEntity> wrapper);
   	
   	List<WuliuluxianfenpeiView> selectListView(Wrapper<WuliuluxianfenpeiEntity> wrapper);
   	
   	WuliuluxianfenpeiView selectView(@Param("ew") Wrapper<WuliuluxianfenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuliuluxianfenpeiEntity> wrapper);
   	
}

