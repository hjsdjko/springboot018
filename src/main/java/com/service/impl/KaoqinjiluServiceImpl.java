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


import com.dao.KaoqinjiluDao;
import com.entity.KaoqinjiluEntity;
import com.service.KaoqinjiluService;
import com.entity.vo.KaoqinjiluVO;
import com.entity.view.KaoqinjiluView;

@Service("kaoqinjiluService")
public class KaoqinjiluServiceImpl extends ServiceImpl<KaoqinjiluDao, KaoqinjiluEntity> implements KaoqinjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoqinjiluEntity> page = this.selectPage(
                new Query<KaoqinjiluEntity>(params).getPage(),
                new EntityWrapper<KaoqinjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoqinjiluEntity> wrapper) {
		  Page<KaoqinjiluView> page =new Query<KaoqinjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<KaoqinjiluVO> selectListVO(Wrapper<KaoqinjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoqinjiluVO selectVO(Wrapper<KaoqinjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoqinjiluView> selectListView(Wrapper<KaoqinjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoqinjiluView selectView(Wrapper<KaoqinjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
