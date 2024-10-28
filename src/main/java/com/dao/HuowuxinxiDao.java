package com.dao;

import com.entity.HuowuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowuxinxiVO;
import com.entity.view.HuowuxinxiView;


/**
 * 货物信息
 * 
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface HuowuxinxiDao extends BaseMapper<HuowuxinxiEntity> {
	
	List<HuowuxinxiVO> selectListVO(@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
	
	HuowuxinxiVO selectVO(@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
	
	List<HuowuxinxiView> selectListView(@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);

	List<HuowuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
	
	HuowuxinxiView selectView(@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
	
}
