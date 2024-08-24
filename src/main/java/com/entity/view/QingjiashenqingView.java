package com.entity.view;

import com.entity.QingjiashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 请假申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@TableName("qingjiashenqing")
public class QingjiashenqingView  extends QingjiashenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QingjiashenqingView(){
	}
 
 	public QingjiashenqingView(QingjiashenqingEntity qingjiashenqingEntity){
 	try {
			BeanUtils.copyProperties(this, qingjiashenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
