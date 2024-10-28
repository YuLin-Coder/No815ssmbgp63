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


import com.dao.WuliuzhuizongDao;
import com.entity.WuliuzhuizongEntity;
import com.service.WuliuzhuizongService;
import com.entity.vo.WuliuzhuizongVO;
import com.entity.view.WuliuzhuizongView;

@Service("wuliuzhuizongService")
public class WuliuzhuizongServiceImpl extends ServiceImpl<WuliuzhuizongDao, WuliuzhuizongEntity> implements WuliuzhuizongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuliuzhuizongEntity> page = this.selectPage(
                new Query<WuliuzhuizongEntity>(params).getPage(),
                new EntityWrapper<WuliuzhuizongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuliuzhuizongEntity> wrapper) {
		  Page<WuliuzhuizongView> page =new Query<WuliuzhuizongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuliuzhuizongVO> selectListVO(Wrapper<WuliuzhuizongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuliuzhuizongVO selectVO(Wrapper<WuliuzhuizongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuliuzhuizongView> selectListView(Wrapper<WuliuzhuizongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuliuzhuizongView selectView(Wrapper<WuliuzhuizongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
