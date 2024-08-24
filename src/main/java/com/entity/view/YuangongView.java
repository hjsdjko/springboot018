package com.entity.view;

import com.entity.YuangongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 员工
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-27 21:11:08
 */
@TableName("yuangong")
public class YuangongView  extends YuangongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongView(){
	}
 
 	public YuangongView(YuangongEntity yuangongEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
