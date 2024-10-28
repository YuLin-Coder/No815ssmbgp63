package com.dao;

import com.entity.CheliangjiaotongguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangjiaotongguanliVO;
import com.entity.view.CheliangjiaotongguanliView;


/**
 * 车辆交通管理
 * 
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface CheliangjiaotongguanliDao extends BaseMapper<CheliangjiaotongguanliEntity> {
	
	List<CheliangjiaotongguanliVO> selectListVO(@Param("ew") Wrapper<CheliangjiaotongguanliEntity> wrapper);
	
	CheliangjiaotongguanliVO selectVO(@Param("ew") Wrapper<CheliangjiaotongguanliEntity> wrapper);
	
	List<CheliangjiaotongguanliView> selectListView(@Param("ew") Wrapper<CheliangjiaotongguanliEntity> wrapper);

	List<CheliangjiaotongguanliView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangjiaotongguanliEntity> wrapper);
	
	CheliangjiaotongguanliView selectView(@Param("ew") Wrapper<CheliangjiaotongguanliEntity> wrapper);
	
}
