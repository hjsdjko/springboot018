package com.entity.vo;

import com.entity.ZhiweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 职位
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public class ZhiweiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 职位
	 */
	
	private String zhiwei;
				
	
	/**
	 * 设置：职位
	 */
	 
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
			
}
