package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoqinjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoqinjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoqinjiluView;


/**
 * 考勤记录
 *
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public interface KaoqinjiluService extends IService<KaoqinjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoqinjiluVO> selectListVO(Wrapper<KaoqinjiluEntity> wrapper);
   	
   	KaoqinjiluVO selectVO(@Param("ew") Wrapper<KaoqinjiluEntity> wrapper);
   	
   	List<KaoqinjiluView> selectListView(Wrapper<KaoqinjiluEntity> wrapper);
   	
   	KaoqinjiluView selectView(@Param("ew") Wrapper<KaoqinjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoqinjiluEntity> wrapper);

   	

}

