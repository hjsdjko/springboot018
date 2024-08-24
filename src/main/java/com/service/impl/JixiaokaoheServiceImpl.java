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


import com.dao.JixiaokaoheDao;
import com.entity.JixiaokaoheEntity;
import com.service.JixiaokaoheService;
import com.entity.vo.JixiaokaoheVO;
import com.entity.view.JixiaokaoheView;

@Service("jixiaokaoheService")
public class JixiaokaoheServiceImpl extends ServiceImpl<JixiaokaoheDao, JixiaokaoheEntity> implements JixiaokaoheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JixiaokaoheEntity> page = this.selectPage(
                new Query<JixiaokaoheEntity>(params).getPage(),
                new EntityWrapper<JixiaokaoheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JixiaokaoheEntity> wrapper) {
		  Page<JixiaokaoheView> page =new Query<JixiaokaoheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JixiaokaoheVO> selectListVO(Wrapper<JixiaokaoheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JixiaokaoheVO selectVO(Wrapper<JixiaokaoheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JixiaokaoheView> selectListView(Wrapper<JixiaokaoheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JixiaokaoheView selectView(Wrapper<JixiaokaoheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
