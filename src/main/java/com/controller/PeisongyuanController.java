package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PeisongyuanEntity;
import com.entity.view.PeisongyuanView;

import com.service.PeisongyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 配送员
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-12 13:47:09
 */
@RestController
@RequestMapping("/peisongyuan")
public class PeisongyuanController {
    @Autowired
    private PeisongyuanService peisongyuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PeisongyuanEntity peisongyuan, 
		HttpServletRequest request){

        EntityWrapper<PeisongyuanEntity> ew = new EntityWrapper<PeisongyuanEntity>();
		PageUtils page = peisongyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peisongyuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PeisongyuanEntity peisongyuan, HttpServletRequest request){
        EntityWrapper<PeisongyuanEntity> ew = new EntityWrapper<PeisongyuanEntity>();
		PageUtils page = peisongyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peisongyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PeisongyuanEntity peisongyuan){
       	EntityWrapper<PeisongyuanEntity> ew = new EntityWrapper<PeisongyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( peisongyuan, "peisongyuan")); 
        return R.ok().put("data", peisongyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PeisongyuanEntity peisongyuan){
        EntityWrapper< PeisongyuanEntity> ew = new EntityWrapper< PeisongyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( peisongyuan, "peisongyuan")); 
		PeisongyuanView peisongyuanView =  peisongyuanService.selectView(ew);
		return R.ok("查询配送员成功").put("data", peisongyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PeisongyuanEntity peisongyuan = peisongyuanService.selectById(id);
        return R.ok().put("data", peisongyuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PeisongyuanEntity peisongyuan = peisongyuanService.selectById(id);
        return R.ok().put("data", peisongyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PeisongyuanEntity peisongyuan, HttpServletRequest request){
    	peisongyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peisongyuan);

        peisongyuanService.insert(peisongyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PeisongyuanEntity peisongyuan, HttpServletRequest request){
    	peisongyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peisongyuan);

        peisongyuanService.insert(peisongyuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PeisongyuanEntity peisongyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(peisongyuan);
        peisongyuanService.updateById(peisongyuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        peisongyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PeisongyuanEntity> wrapper = new EntityWrapper<PeisongyuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = peisongyuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
