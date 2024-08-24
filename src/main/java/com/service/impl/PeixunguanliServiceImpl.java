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


import com.dao.PeixunguanliDao;
import com.entity.PeixunguanliEntity;
import com.service.PeixunguanliService;
import com.entity.vo.PeixunguanliVO;
import com.entity.view.PeixunguanliView;

@Service("peixunguanliService")
public class PeixunguanliServiceImpl extends ServiceImpl<PeixunguanliDao, PeixunguanliEntity> implements PeixunguanliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixunguanliEntity> page = this.selectPage(
                new Query<PeixunguanliEntity>(params).getPage(),
                new EntityWrapper<PeixunguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixunguanliEntity> wrapper) {
		  Page<PeixunguanliView> page =new Query<PeixunguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<PeixunguanliVO> selectListVO(Wrapper<PeixunguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixunguanliVO selectVO(Wrapper<PeixunguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixunguanliView> selectListView(Wrapper<PeixunguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixunguanliView selectView(Wrapper<PeixunguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
