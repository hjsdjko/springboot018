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

import com.entity.JixiaokaoheEntity;
import com.entity.view.JixiaokaoheView;

import com.service.JixiaokaoheService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 绩效考核
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@RestController
@RequestMapping("/jixiaokaohe")
public class JixiaokaoheController {
    @Autowired
    private JixiaokaoheService jixiaokaoheService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JixiaokaoheEntity jixiaokaohe,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			jixiaokaohe.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JixiaokaoheEntity> ew = new EntityWrapper<JixiaokaoheEntity>();

		PageUtils page = jixiaokaoheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jixiaokaohe), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JixiaokaoheEntity jixiaokaohe, 
		HttpServletRequest request){
        EntityWrapper<JixiaokaoheEntity> ew = new EntityWrapper<JixiaokaoheEntity>();

		PageUtils page = jixiaokaoheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jixiaokaohe), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JixiaokaoheEntity jixiaokaohe){
       	EntityWrapper<JixiaokaoheEntity> ew = new EntityWrapper<JixiaokaoheEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jixiaokaohe, "jixiaokaohe")); 
        return R.ok().put("data", jixiaokaoheService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JixiaokaoheEntity jixiaokaohe){
        EntityWrapper< JixiaokaoheEntity> ew = new EntityWrapper< JixiaokaoheEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jixiaokaohe, "jixiaokaohe")); 
		JixiaokaoheView jixiaokaoheView =  jixiaokaoheService.selectView(ew);
		return R.ok("查询绩效考核成功").put("data", jixiaokaoheView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JixiaokaoheEntity jixiaokaohe = jixiaokaoheService.selectById(id);
        return R.ok().put("data", jixiaokaohe);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JixiaokaoheEntity jixiaokaohe = jixiaokaoheService.selectById(id);
        return R.ok().put("data", jixiaokaohe);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JixiaokaoheEntity jixiaokaohe, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jixiaokaohe);
        jixiaokaoheService.insert(jixiaokaohe);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JixiaokaoheEntity jixiaokaohe, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jixiaokaohe);
        jixiaokaoheService.insert(jixiaokaohe);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JixiaokaoheEntity jixiaokaohe, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jixiaokaohe);
        jixiaokaoheService.updateById(jixiaokaohe);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jixiaokaoheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
