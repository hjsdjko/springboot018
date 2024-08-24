package com.dao;

import com.entity.YuangongxinziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongxinziVO;
import com.entity.view.YuangongxinziView;


/**
 * 员工薪资
 * 
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface YuangongxinziDao extends BaseMapper<YuangongxinziEntity> {
	
	List<YuangongxinziVO> selectListVO(@Param("ew") Wrapper<YuangongxinziEntity> wrapper);
	
	YuangongxinziVO selectVO(@Param("ew") Wrapper<YuangongxinziEntity> wrapper);
	
	List<YuangongxinziView> selectListView(@Param("ew") Wrapper<YuangongxinziEntity> wrapper);

	List<YuangongxinziView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongxinziEntity> wrapper);

	
	YuangongxinziView selectView(@Param("ew") Wrapper<YuangongxinziEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuangongxinziEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuangongxinziEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuangongxinziEntity> wrapper);



}
