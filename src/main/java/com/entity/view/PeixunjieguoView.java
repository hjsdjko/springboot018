package com.entity.view;

import com.entity.PeixunjieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 培训结果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@TableName("peixunjieguo")
public class PeixunjieguoView  extends PeixunjieguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeixunjieguoView(){
	}
 
 	public PeixunjieguoView(PeixunjieguoEntity peixunjieguoEntity){
 	try {
			BeanUtils.copyProperties(this, peixunjieguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
