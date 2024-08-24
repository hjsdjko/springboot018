package com.dao;

import com.entity.JixiaokaoheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JixiaokaoheVO;
import com.entity.view.JixiaokaoheView;


/**
 * 绩效考核
 * 
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface JixiaokaoheDao extends BaseMapper<JixiaokaoheEntity> {
	
	List<JixiaokaoheVO> selectListVO(@Param("ew") Wrapper<JixiaokaoheEntity> wrapper);
	
	JixiaokaoheVO selectVO(@Param("ew") Wrapper<JixiaokaoheEntity> wrapper);
	
	List<JixiaokaoheView> selectListView(@Param("ew") Wrapper<JixiaokaoheEntity> wrapper);

	List<JixiaokaoheView> selectListView(Pagination page,@Param("ew") Wrapper<JixiaokaoheEntity> wrapper);

	
	JixiaokaoheView selectView(@Param("ew") Wrapper<JixiaokaoheEntity> wrapper);
	

}
