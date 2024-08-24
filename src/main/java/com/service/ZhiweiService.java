package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiweiView;


/**
 * 职位
 *
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface ZhiweiService extends IService<ZhiweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiweiVO> selectListVO(Wrapper<ZhiweiEntity> wrapper);
   	
   	ZhiweiVO selectVO(@Param("ew") Wrapper<ZhiweiEntity> wrapper);
   	
   	List<ZhiweiView> selectListView(Wrapper<ZhiweiEntity> wrapper);
   	
   	ZhiweiView selectView(@Param("ew") Wrapper<ZhiweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiweiEntity> wrapper);

   	

}

