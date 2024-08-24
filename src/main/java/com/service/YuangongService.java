package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongView;


/**
 * 员工
 *
 * @author 
 * @email 
 * @date 2024-04-27 21:11:08
 */
public interface YuangongService extends IService<YuangongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongVO> selectListVO(Wrapper<YuangongEntity> wrapper);
   	
   	YuangongVO selectVO(@Param("ew") Wrapper<YuangongEntity> wrapper);
   	
   	List<YuangongView> selectListView(Wrapper<YuangongEntity> wrapper);
   	
   	YuangongView selectView(@Param("ew") Wrapper<YuangongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YuangongEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YuangongEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YuangongEntity> wrapper);



}

