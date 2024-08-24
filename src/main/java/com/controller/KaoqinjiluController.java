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

import com.entity.KaoqinjiluEntity;
import com.entity.view.KaoqinjiluView;

import com.service.KaoqinjiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 考勤记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@RestController
@RequestMapping("/kaoqinjilu")
public class KaoqinjiluController {
    @Autowired
    private KaoqinjiluService kaoqinjiluService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaoqinjiluEntity kaoqinjilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			kaoqinjilu.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KaoqinjiluEntity> ew = new EntityWrapper<KaoqinjiluEntity>();

		PageUtils page = kaoqinjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoqinjilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaoqinjiluEntity kaoqinjilu, 
		HttpServletRequest request){
        EntityWrapper<KaoqinjiluEntity> ew = new EntityWrapper<KaoqinjiluEntity>();

		PageUtils page = kaoqinjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoqinjilu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaoqinjiluEntity kaoqinjilu){
       	EntityWrapper<KaoqinjiluEntity> ew = new EntityWrapper<KaoqinjiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaoqinjilu, "kaoqinjilu")); 
        return R.ok().put("data", kaoqinjiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaoqinjiluEntity kaoqinjilu){
        EntityWrapper< KaoqinjiluEntity> ew = new EntityWrapper< KaoqinjiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaoqinjilu, "kaoqinjilu")); 
		KaoqinjiluView kaoqinjiluView =  kaoqinjiluService.selectView(ew);
		return R.ok("查询考勤记录成功").put("data", kaoqinjiluView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaoqinjiluEntity kaoqinjilu = kaoqinjiluService.selectById(id);
        return R.ok().put("data", kaoqinjilu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaoqinjiluEntity kaoqinjilu = kaoqinjiluService.selectById(id);
        return R.ok().put("data", kaoqinjilu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaoqinjiluEntity kaoqinjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kaoqinjilu);
        kaoqinjiluService.insert(kaoqinjilu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaoqinjiluEntity kaoqinjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kaoqinjilu);
        kaoqinjiluService.insert(kaoqinjilu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KaoqinjiluEntity kaoqinjilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaoqinjilu);
        kaoqinjiluService.updateById(kaoqinjilu);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<KaoqinjiluEntity> list = new ArrayList<KaoqinjiluEntity>();
        for(Long id : ids) {
            KaoqinjiluEntity kaoqinjilu = kaoqinjiluService.selectById(id);
            kaoqinjilu.setSfsh(sfsh);
            kaoqinjilu.setShhf(shhf);
            list.add(kaoqinjilu);
        }
        kaoqinjiluService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaoqinjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
