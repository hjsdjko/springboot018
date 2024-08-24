package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunjieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunjieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunjieguoView;


/**
 * 培训结果
 *
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface PeixunjieguoService extends IService<PeixunjieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunjieguoVO> selectListVO(Wrapper<PeixunjieguoEntity> wrapper);
   	
   	PeixunjieguoVO selectVO(@Param("ew") Wrapper<PeixunjieguoEntity> wrapper);
   	
   	List<PeixunjieguoView> selectListView(Wrapper<PeixunjieguoEntity> wrapper);
   	
   	PeixunjieguoView selectView(@Param("ew") Wrapper<PeixunjieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunjieguoEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<PeixunjieguoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<PeixunjieguoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<PeixunjieguoEntity> wrapper);



}

