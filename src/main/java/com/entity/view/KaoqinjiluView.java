package com.entity.view;

import com.entity.KaoqinjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 考勤记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@TableName("kaoqinjilu")
public class KaoqinjiluView  extends KaoqinjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoqinjiluView(){
	}
 
 	public KaoqinjiluView(KaoqinjiluEntity kaoqinjiluEntity){
 	try {
			BeanUtils.copyProperties(this, kaoqinjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
