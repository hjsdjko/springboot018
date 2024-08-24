package com.dao;

import com.entity.YuangongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongVO;
import com.entity.view.YuangongView;


/**
 * 员工
 * 
 * @author 
 * @email 
 * @date 2024-04-27 21:11:08
 */
public interface YuangongDao extends BaseMapper<YuangongEntity> {
	
	List<YuangongVO> selectListVO(@Param("ew") Wrapper<YuangongEntity> wrapper);
	
	YuangongVO selectVO(@Param("ew") Wrapper<YuangongEntity> wrapper);
	
	List<YuangongView> selectListView(@Param("ew") Wrapper<YuangongEntity> wrapper);

	List<YuangongView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongEntity> wrapper);

	
	YuangongView selectView(@Param("ew") Wrapper<YuangongEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuangongEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuangongEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuangongEntity> wrapper);



}
