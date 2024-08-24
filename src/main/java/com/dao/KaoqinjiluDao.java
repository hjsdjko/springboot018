package com.dao;

import com.entity.KaoqinjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoqinjiluVO;
import com.entity.view.KaoqinjiluView;


/**
 * 考勤记录
 * 
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface KaoqinjiluDao extends BaseMapper<KaoqinjiluEntity> {
	
	List<KaoqinjiluVO> selectListVO(@Param("ew") Wrapper<KaoqinjiluEntity> wrapper);
	
	KaoqinjiluVO selectVO(@Param("ew") Wrapper<KaoqinjiluEntity> wrapper);
	
	List<KaoqinjiluView> selectListView(@Param("ew") Wrapper<KaoqinjiluEntity> wrapper);

	List<KaoqinjiluView> selectListView(Pagination page,@Param("ew") Wrapper<KaoqinjiluEntity> wrapper);

	
	KaoqinjiluView selectView(@Param("ew") Wrapper<KaoqinjiluEntity> wrapper);
	

}
