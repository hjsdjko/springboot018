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


import com.dao.PeixunjieguoDao;
import com.entity.PeixunjieguoEntity;
import com.service.PeixunjieguoService;
import com.entity.vo.PeixunjieguoVO;
import com.entity.view.PeixunjieguoView;

@Service("peixunjieguoService")
public class PeixunjieguoServiceImpl extends ServiceImpl<PeixunjieguoDao, PeixunjieguoEntity> implements PeixunjieguoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixunjieguoEntity> page = this.selectPage(
                new Query<PeixunjieguoEntity>(params).getPage(),
                new EntityWrapper<PeixunjieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixunjieguoEntity> wrapper) {
		  Page<PeixunjieguoView> page =new Query<PeixunjieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<PeixunjieguoVO> selectListVO(Wrapper<PeixunjieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixunjieguoVO selectVO(Wrapper<PeixunjieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixunjieguoView> selectListView(Wrapper<PeixunjieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixunjieguoView selectView(Wrapper<PeixunjieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<PeixunjieguoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<PeixunjieguoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<PeixunjieguoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
