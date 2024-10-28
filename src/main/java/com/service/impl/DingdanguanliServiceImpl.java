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


import com.dao.DingdanguanliDao;
import com.entity.DingdanguanliEntity;
import com.service.DingdanguanliService;
import com.entity.vo.DingdanguanliVO;
import com.entity.view.DingdanguanliView;

@Service("dingdanguanliService")
public class DingdanguanliServiceImpl extends ServiceImpl<DingdanguanliDao, DingdanguanliEntity> implements DingdanguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanguanliEntity> page = this.selectPage(
                new Query<DingdanguanliEntity>(params).getPage(),
                new EntityWrapper<DingdanguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanguanliEntity> wrapper) {
		  Page<DingdanguanliView> page =new Query<DingdanguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdanguanliVO> selectListVO(Wrapper<DingdanguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdanguanliVO selectVO(Wrapper<DingdanguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdanguanliView> selectListView(Wrapper<DingdanguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanguanliView selectView(Wrapper<DingdanguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
