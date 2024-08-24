package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhiweiEntity;
import com.entity.view.ZhiweiView;

import com.service.ZhiweiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 职位
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@RestController
@RequestMapping("/zhiwei")
public class ZhiweiController {
    @Autowired
    private ZhiweiService zhiweiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiweiEntity zhiwei,
		HttpServletRequest request){
        EntityWrapper<ZhiweiEntity> ew = new EntityWrapper<ZhiweiEntity>();

		PageUtils page = zhiweiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiwei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhiweiEntity zhiwei, 
		HttpServletRequest request){
        EntityWrapper<ZhiweiEntity> ew = new EntityWrapper<ZhiweiEntity>();

		PageUtils page = zhiweiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiwei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiweiEntity zhiwei){
       	EntityWrapper<ZhiweiEntity> ew = new EntityWrapper<ZhiweiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiwei, "zhiwei")); 
        return R.ok().put("data", zhiweiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiweiEntity zhiwei){
        EntityWrapper< ZhiweiEntity> ew = new EntityWrapper< ZhiweiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiwei, "zhiwei")); 
		ZhiweiView zhiweiView =  zhiweiService.selectView(ew);
		return R.ok("查询职位成功").put("data", zhiweiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiweiEntity zhiwei = zhiweiService.selectById(id);
        return R.ok().put("data", zhiwei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiweiEntity zhiwei = zhiweiService.selectById(id);
        return R.ok().put("data", zhiwei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiweiEntity zhiwei, HttpServletRequest request){
        if(zhiweiService.selectCount(new EntityWrapper<ZhiweiEntity>().eq("zhiwei", zhiwei.getZhiwei()))>0) {
            return R.error("职位已存在");
        }
    	//ValidatorUtils.validateEntity(zhiwei);
        zhiweiService.insert(zhiwei);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiweiEntity zhiwei, HttpServletRequest request){
        if(zhiweiService.selectCount(new EntityWrapper<ZhiweiEntity>().eq("zhiwei", zhiwei.getZhiwei()))>0) {
            return R.error("职位已存在");
        }
    	//ValidatorUtils.validateEntity(zhiwei);
        zhiweiService.insert(zhiwei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhiweiEntity zhiwei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiwei);
        if(zhiweiService.selectCount(new EntityWrapper<ZhiweiEntity>().ne("id", zhiwei.getId()).eq("zhiwei", zhiwei.getZhiwei()))>0) {
            return R.error("职位已存在");
        }
        zhiweiService.updateById(zhiwei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhiweiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
