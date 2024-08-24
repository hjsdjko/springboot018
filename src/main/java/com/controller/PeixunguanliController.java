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

import com.entity.PeixunguanliEntity;
import com.entity.view.PeixunguanliView;

import com.service.PeixunguanliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 培训管理
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@RestController
@RequestMapping("/peixunguanli")
public class PeixunguanliController {
    @Autowired
    private PeixunguanliService peixunguanliService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PeixunguanliEntity peixunguanli,
		HttpServletRequest request){
        EntityWrapper<PeixunguanliEntity> ew = new EntityWrapper<PeixunguanliEntity>();

		PageUtils page = peixunguanliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peixunguanli), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PeixunguanliEntity peixunguanli, 
		HttpServletRequest request){
        EntityWrapper<PeixunguanliEntity> ew = new EntityWrapper<PeixunguanliEntity>();

		PageUtils page = peixunguanliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peixunguanli), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PeixunguanliEntity peixunguanli){
       	EntityWrapper<PeixunguanliEntity> ew = new EntityWrapper<PeixunguanliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( peixunguanli, "peixunguanli")); 
        return R.ok().put("data", peixunguanliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PeixunguanliEntity peixunguanli){
        EntityWrapper< PeixunguanliEntity> ew = new EntityWrapper< PeixunguanliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( peixunguanli, "peixunguanli")); 
		PeixunguanliView peixunguanliView =  peixunguanliService.selectView(ew);
		return R.ok("查询培训管理成功").put("data", peixunguanliView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PeixunguanliEntity peixunguanli = peixunguanliService.selectById(id);
        return R.ok().put("data", peixunguanli);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PeixunguanliEntity peixunguanli = peixunguanliService.selectById(id);
        return R.ok().put("data", peixunguanli);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PeixunguanliEntity peixunguanli, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(peixunguanli);
        peixunguanliService.insert(peixunguanli);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PeixunguanliEntity peixunguanli, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(peixunguanli);
        peixunguanliService.insert(peixunguanli);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody PeixunguanliEntity peixunguanli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(peixunguanli);
        peixunguanliService.updateById(peixunguanli);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        peixunguanliService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
