package com.dao;

import com.entity.WuliuluxianfenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuliuluxianfenpeiVO;
import com.entity.view.WuliuluxianfenpeiView;


/**
 * 物流路线分配
 * 
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface WuliuluxianfenpeiDao extends BaseMapper<WuliuluxianfenpeiEntity> {
	
	List<WuliuluxianfenpeiVO> selectListVO(@Param("ew") Wrapper<WuliuluxianfenpeiEntity> wrapper);
	
	WuliuluxianfenpeiVO selectVO(@Param("ew") Wrapper<WuliuluxianfenpeiEntity> wrapper);
	
	List<WuliuluxianfenpeiView> selectListView(@Param("ew") Wrapper<WuliuluxianfenpeiEntity> wrapper);

	List<WuliuluxianfenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<WuliuluxianfenpeiEntity> wrapper);
	
	WuliuluxianfenpeiView selectView(@Param("ew") Wrapper<WuliuluxianfenpeiEntity> wrapper);
	
}
