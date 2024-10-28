package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuowufenleiDao;
import com.entity.HuowufenleiEntity;
import com.service.HuowufenleiService;
import com.entity.vo.HuowufenleiVO;
import com.entity.view.HuowufenleiView;

@Service("huowufenleiService")
public class HuowufenleiServiceImpl extends ServiceImpl<HuowufenleiDao, HuowufenleiEntity> implements HuowufenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuowufenleiEntity> page = this.selectPage(
                new Query<HuowufenleiEntity>(params).getPage(),
                new EntityWrapper<HuowufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuowufenleiEntity> wrapper) {
		  Page<HuowufenleiView> page =new Query<HuowufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuowufenleiVO> selectListVO(Wrapper<HuowufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuowufenleiVO selectVO(Wrapper<HuowufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuowufenleiView> selectListView(Wrapper<HuowufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuowufenleiView selectView(Wrapper<HuowufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
