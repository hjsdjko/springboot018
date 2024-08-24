package com.entity.vo;

import com.entity.PeixunguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 培训管理
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public class PeixunguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培训内容
	 */
	
	private String peixunneirong;
		
	/**
	 * 培训部门
	 */
	
	private String bumen;
		
	/**
	 * 培训人员
	 */
	
	private String peixunrenyuan;
		
	/**
	 * 培训时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date peixunshijian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：培训内容
	 */
	 
	public void setPeixunneirong(String peixunneirong) {
		this.peixunneirong = peixunneirong;
	}
	
	/**
	 * 获取：培训内容
	 */
	public String getPeixunneirong() {
		return peixunneirong;
	}
				
	
	/**
	 * 设置：培训部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：培训部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：培训人员
	 */
	 
	public void setPeixunrenyuan(String peixunrenyuan) {
		this.peixunrenyuan = peixunrenyuan;
	}
	
	/**
	 * 获取：培训人员
	 */
	public String getPeixunrenyuan() {
		return peixunrenyuan;
	}
				
	
	/**
	 * 设置：培训时间
	 */
	 
	public void setPeixunshijian(Date peixunshijian) {
		this.peixunshijian = peixunshijian;
	}
	
	/**
	 * 获取：培训时间
	 */
	public Date getPeixunshijian() {
		return peixunshijian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
