package com.dao;

import com.entity.PeixunguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeixunguanliVO;
import com.entity.view.PeixunguanliView;


/**
 * 培训管理
 * 
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface PeixunguanliDao extends BaseMapper<PeixunguanliEntity> {
	
	List<PeixunguanliVO> selectListVO(@Param("ew") Wrapper<PeixunguanliEntity> wrapper);
	
	PeixunguanliVO selectVO(@Param("ew") Wrapper<PeixunguanliEntity> wrapper);
	
	List<PeixunguanliView> selectListView(@Param("ew") Wrapper<PeixunguanliEntity> wrapper);

	List<PeixunguanliView> selectListView(Pagination page,@Param("ew") Wrapper<PeixunguanliEntity> wrapper);

	
	PeixunguanliView selectView(@Param("ew") Wrapper<PeixunguanliEntity> wrapper);
	

}
