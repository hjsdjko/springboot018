package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JixiaokaoheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JixiaokaoheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JixiaokaoheView;


/**
 * 绩效考核
 *
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface JixiaokaoheService extends IService<JixiaokaoheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JixiaokaoheVO> selectListVO(Wrapper<JixiaokaoheEntity> wrapper);
   	
   	JixiaokaoheVO selectVO(@Param("ew") Wrapper<JixiaokaoheEntity> wrapper);
   	
   	List<JixiaokaoheView> selectListView(Wrapper<JixiaokaoheEntity> wrapper);
   	
   	JixiaokaoheView selectView(@Param("ew") Wrapper<JixiaokaoheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JixiaokaoheEntity> wrapper);

   	

}

