package com.dao;

import com.entity.WuliuzhuizongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuliuzhuizongVO;
import com.entity.view.WuliuzhuizongView;


/**
 * 物流追踪
 * 
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface WuliuzhuizongDao extends BaseMapper<WuliuzhuizongEntity> {
	
	List<WuliuzhuizongVO> selectListVO(@Param("ew") Wrapper<WuliuzhuizongEntity> wrapper);
	
	WuliuzhuizongVO selectVO(@Param("ew") Wrapper<WuliuzhuizongEntity> wrapper);
	
	List<WuliuzhuizongView> selectListView(@Param("ew") Wrapper<WuliuzhuizongEntity> wrapper);

	List<WuliuzhuizongView> selectListView(Pagination page,@Param("ew") Wrapper<WuliuzhuizongEntity> wrapper);
	
	WuliuzhuizongView selectView(@Param("ew") Wrapper<WuliuzhuizongEntity> wrapper);
	
}
