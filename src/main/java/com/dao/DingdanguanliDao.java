package com.dao;

import com.entity.DingdanguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdanguanliVO;
import com.entity.view.DingdanguanliView;


/**
 * 订单管理
 * 
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface DingdanguanliDao extends BaseMapper<DingdanguanliEntity> {
	
	List<DingdanguanliVO> selectListVO(@Param("ew") Wrapper<DingdanguanliEntity> wrapper);
	
	DingdanguanliVO selectVO(@Param("ew") Wrapper<DingdanguanliEntity> wrapper);
	
	List<DingdanguanliView> selectListView(@Param("ew") Wrapper<DingdanguanliEntity> wrapper);

	List<DingdanguanliView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanguanliEntity> wrapper);
	
	DingdanguanliView selectView(@Param("ew") Wrapper<DingdanguanliEntity> wrapper);
	
}
