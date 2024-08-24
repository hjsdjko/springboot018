package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunguanliView;


/**
 * 培训管理
 *
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface PeixunguanliService extends IService<PeixunguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunguanliVO> selectListVO(Wrapper<PeixunguanliEntity> wrapper);
   	
   	PeixunguanliVO selectVO(@Param("ew") Wrapper<PeixunguanliEntity> wrapper);
   	
   	List<PeixunguanliView> selectListView(Wrapper<PeixunguanliEntity> wrapper);
   	
   	PeixunguanliView selectView(@Param("ew") Wrapper<PeixunguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunguanliEntity> wrapper);

   	

}

