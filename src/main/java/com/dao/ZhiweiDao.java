package com.dao;

import com.entity.ZhiweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiweiVO;
import com.entity.view.ZhiweiView;


/**
 * 职位
 * 
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface ZhiweiDao extends BaseMapper<ZhiweiEntity> {
	
	List<ZhiweiVO> selectListVO(@Param("ew") Wrapper<ZhiweiEntity> wrapper);
	
	ZhiweiVO selectVO(@Param("ew") Wrapper<ZhiweiEntity> wrapper);
	
	List<ZhiweiView> selectListView(@Param("ew") Wrapper<ZhiweiEntity> wrapper);

	List<ZhiweiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiweiEntity> wrapper);

	
	ZhiweiView selectView(@Param("ew") Wrapper<ZhiweiEntity> wrapper);
	

}
