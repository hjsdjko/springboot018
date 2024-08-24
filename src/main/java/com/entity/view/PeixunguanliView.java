package com.entity.view;

import com.entity.PeixunguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 培训管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@TableName("peixunguanli")
public class PeixunguanliView  extends PeixunguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeixunguanliView(){
	}
 
 	public PeixunguanliView(PeixunguanliEntity peixunguanliEntity){
 	try {
			BeanUtils.copyProperties(this, peixunguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
