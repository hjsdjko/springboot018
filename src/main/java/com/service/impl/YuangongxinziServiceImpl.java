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


import com.dao.YuangongxinziDao;
import com.entity.YuangongxinziEntity;
import com.service.YuangongxinziService;
import com.entity.vo.YuangongxinziVO;
import com.entity.view.YuangongxinziView;

@Service("yuangongxinziService")
public class YuangongxinziServiceImpl extends ServiceImpl<YuangongxinziDao, YuangongxinziEntity> implements YuangongxinziService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongxinziEntity> page = this.selectPage(
                new Query<YuangongxinziEntity>(params).getPage(),
                new EntityWrapper<YuangongxinziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongxinziEntity> wrapper) {
		  Page<YuangongxinziView> page =new Query<YuangongxinziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YuangongxinziVO> selectListVO(Wrapper<YuangongxinziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongxinziVO selectVO(Wrapper<YuangongxinziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongxinziView> selectListView(Wrapper<YuangongxinziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongxinziView selectView(Wrapper<YuangongxinziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YuangongxinziEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YuangongxinziEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YuangongxinziEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
