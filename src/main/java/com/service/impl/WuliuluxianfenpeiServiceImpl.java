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


import com.dao.WuliuluxianfenpeiDao;
import com.entity.WuliuluxianfenpeiEntity;
import com.service.WuliuluxianfenpeiService;
import com.entity.vo.WuliuluxianfenpeiVO;
import com.entity.view.WuliuluxianfenpeiView;

@Service("wuliuluxianfenpeiService")
public class WuliuluxianfenpeiServiceImpl extends ServiceImpl<WuliuluxianfenpeiDao, WuliuluxianfenpeiEntity> implements WuliuluxianfenpeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuliuluxianfenpeiEntity> page = this.selectPage(
                new Query<WuliuluxianfenpeiEntity>(params).getPage(),
                new EntityWrapper<WuliuluxianfenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuliuluxianfenpeiEntity> wrapper) {
		  Page<WuliuluxianfenpeiView> page =new Query<WuliuluxianfenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuliuluxianfenpeiVO> selectListVO(Wrapper<WuliuluxianfenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuliuluxianfenpeiVO selectVO(Wrapper<WuliuluxianfenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuliuluxianfenpeiView> selectListView(Wrapper<WuliuluxianfenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuliuluxianfenpeiView selectView(Wrapper<WuliuluxianfenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
