package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongxinziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongxinziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongxinziView;


/**
 * 员工薪资
 *
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface YuangongxinziService extends IService<YuangongxinziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongxinziVO> selectListVO(Wrapper<YuangongxinziEntity> wrapper);
   	
   	YuangongxinziVO selectVO(@Param("ew") Wrapper<YuangongxinziEntity> wrapper);
   	
   	List<YuangongxinziView> selectListView(Wrapper<YuangongxinziEntity> wrapper);
   	
   	YuangongxinziView selectView(@Param("ew") Wrapper<YuangongxinziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongxinziEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YuangongxinziEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YuangongxinziEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YuangongxinziEntity> wrapper);



}

