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


import com.dao.CheliangjiaotongleixingDao;
import com.entity.CheliangjiaotongleixingEntity;
import com.service.CheliangjiaotongleixingService;
import com.entity.vo.CheliangjiaotongleixingVO;
import com.entity.view.CheliangjiaotongleixingView;

@Service("cheliangjiaotongleixingService")
public class CheliangjiaotongleixingServiceImpl extends ServiceImpl<CheliangjiaotongleixingDao, CheliangjiaotongleixingEntity> implements CheliangjiaotongleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangjiaotongleixingEntity> page = this.selectPage(
                new Query<CheliangjiaotongleixingEntity>(params).getPage(),
                new EntityWrapper<CheliangjiaotongleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangjiaotongleixingEntity> wrapper) {
		  Page<CheliangjiaotongleixingView> page =new Query<CheliangjiaotongleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangjiaotongleixingVO> selectListVO(Wrapper<CheliangjiaotongleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangjiaotongleixingVO selectVO(Wrapper<CheliangjiaotongleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangjiaotongleixingView> selectListView(Wrapper<CheliangjiaotongleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangjiaotongleixingView selectView(Wrapper<CheliangjiaotongleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
