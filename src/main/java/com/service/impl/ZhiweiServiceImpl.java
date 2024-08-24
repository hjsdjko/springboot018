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


import com.dao.ZhiweiDao;
import com.entity.ZhiweiEntity;
import com.service.ZhiweiService;
import com.entity.vo.ZhiweiVO;
import com.entity.view.ZhiweiView;

@Service("zhiweiService")
public class ZhiweiServiceImpl extends ServiceImpl<ZhiweiDao, ZhiweiEntity> implements ZhiweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiweiEntity> page = this.selectPage(
                new Query<ZhiweiEntity>(params).getPage(),
                new EntityWrapper<ZhiweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiweiEntity> wrapper) {
		  Page<ZhiweiView> page =new Query<ZhiweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhiweiVO> selectListVO(Wrapper<ZhiweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiweiVO selectVO(Wrapper<ZhiweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiweiView> selectListView(Wrapper<ZhiweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiweiView selectView(Wrapper<ZhiweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
