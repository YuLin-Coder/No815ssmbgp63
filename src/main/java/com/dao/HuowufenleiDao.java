package com.dao;

import com.entity.HuowufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowufenleiVO;
import com.entity.view.HuowufenleiView;


/**
 * 货物分类
 * 
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
public interface HuowufenleiDao extends BaseMapper<HuowufenleiEntity> {
	
	List<HuowufenleiVO> selectListVO(@Param("ew") Wrapper<HuowufenleiEntity> wrapper);
	
	HuowufenleiVO selectVO(@Param("ew") Wrapper<HuowufenleiEntity> wrapper);
	
	List<HuowufenleiView> selectListView(@Param("ew") Wrapper<HuowufenleiEntity> wrapper);

	List<HuowufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<HuowufenleiEntity> wrapper);
	
	HuowufenleiView selectView(@Param("ew") Wrapper<HuowufenleiEntity> wrapper);
	
}
