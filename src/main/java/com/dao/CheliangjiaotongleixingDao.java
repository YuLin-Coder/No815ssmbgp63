package com.dao;

import com.entity.CheliangjiaotongleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangjiaotongleixingVO;
import com.entity.view.CheliangjiaotongleixingView;


/**
 * 车辆交通类型
 * 
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface CheliangjiaotongleixingDao extends BaseMapper<CheliangjiaotongleixingEntity> {
	
	List<CheliangjiaotongleixingVO> selectListVO(@Param("ew") Wrapper<CheliangjiaotongleixingEntity> wrapper);
	
	CheliangjiaotongleixingVO selectVO(@Param("ew") Wrapper<CheliangjiaotongleixingEntity> wrapper);
	
	List<CheliangjiaotongleixingView> selectListView(@Param("ew") Wrapper<CheliangjiaotongleixingEntity> wrapper);

	List<CheliangjiaotongleixingView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangjiaotongleixingEntity> wrapper);
	
	CheliangjiaotongleixingView selectView(@Param("ew") Wrapper<CheliangjiaotongleixingEntity> wrapper);
	
}
