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

import com.entity.BumenEntity;
import com.entity.view.BumenView;

import com.service.BumenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 部门
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-27 21:11:08
 */
@RestController
@RequestMapping("/bumen")
public class BumenController {
    @Autowired
    private BumenService bumenService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BumenEntity bumen,
		HttpServletRequest request){
        EntityWrapper<BumenEntity> ew = new EntityWrapper<BumenEntity>();

		PageUtils page = bumenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bumen), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BumenEntity bumen, 
		HttpServletRequest request){
        EntityWrapper<BumenEntity> ew = new EntityWrapper<BumenEntity>();

		PageUtils page = bumenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bumen), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BumenEntity bumen){
       	EntityWrapper<BumenEntity> ew = new EntityWrapper<BumenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bumen, "bumen")); 
        return R.ok().put("data", bumenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BumenEntity bumen){
        EntityWrapper< BumenEntity> ew = new EntityWrapper< BumenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bumen, "bumen")); 
		BumenView bumenView =  bumenService.selectView(ew);
		return R.ok("查询部门成功").put("data", bumenView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BumenEntity bumen = bumenService.selectById(id);
        return R.ok().put("data", bumen);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BumenEntity bumen = bumenService.selectById(id);
        return R.ok().put("data", bumen);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BumenEntity bumen, HttpServletRequest request){
        if(bumenService.selectCount(new EntityWrapper<BumenEntity>().eq("bumen", bumen.getBumen()))>0) {
            return R.error("部门已存在");
        }
    	//ValidatorUtils.validateEntity(bumen);
        bumenService.insert(bumen);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BumenEntity bumen, HttpServletRequest request){
        if(bumenService.selectCount(new EntityWrapper<BumenEntity>().eq("bumen", bumen.getBumen()))>0) {
            return R.error("部门已存在");
        }
    	//ValidatorUtils.validateEntity(bumen);
        bumenService.insert(bumen);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BumenEntity bumen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bumen);
        if(bumenService.selectCount(new EntityWrapper<BumenEntity>().ne("id", bumen.getId()).eq("bumen", bumen.getBumen()))>0) {
            return R.error("部门已存在");
        }
        bumenService.updateById(bumen);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        bumenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
