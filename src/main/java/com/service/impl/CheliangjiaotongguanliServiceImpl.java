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


import com.dao.CheliangjiaotongguanliDao;
import com.entity.CheliangjiaotongguanliEntity;
import com.service.CheliangjiaotongguanliService;
import com.entity.vo.CheliangjiaotongguanliVO;
import com.entity.view.CheliangjiaotongguanliView;

@Service("cheliangjiaotongguanliService")
public class CheliangjiaotongguanliServiceImpl extends ServiceImpl<CheliangjiaotongguanliDao, CheliangjiaotongguanliEntity> implements CheliangjiaotongguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangjiaotongguanliEntity> page = this.selectPage(
                new Query<CheliangjiaotongguanliEntity>(params).getPage(),
                new EntityWrapper<CheliangjiaotongguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangjiaotongguanliEntity> wrapper) {
		  Page<CheliangjiaotongguanliView> page =new Query<CheliangjiaotongguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangjiaotongguanliVO> selectListVO(Wrapper<CheliangjiaotongguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangjiaotongguanliVO selectVO(Wrapper<CheliangjiaotongguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangjiaotongguanliView> selectListView(Wrapper<CheliangjiaotongguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangjiaotongguanliView selectView(Wrapper<CheliangjiaotongguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
