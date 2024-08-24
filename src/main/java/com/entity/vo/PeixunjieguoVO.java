package com.entity.vo;

import com.entity.PeixunjieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 培训结果
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public class PeixunjieguoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培训部门
	 */
	
	private String bumen;
		
	/**
	 * 培训内容
	 */
	
	private String peixunneirong;
		
	/**
	 * 培训人员
	 */
	
	private String peixunrenyuan;
		
	/**
	 * 培训时间
	 */
	
	private String peixunshijian;
		
	/**
	 * 培训结果
	 */
	
	private String peixunjieguo;
		
	/**
	 * 培训评分
	 */
	
	private Integer peixunpingfen;
		
	/**
	 * 记录时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jilushijian;
				
	
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
	 
	public void setPeixunshijian(String peixunshijian) {
		this.peixunshijian = peixunshijian;
	}
	
	/**
	 * 获取：培训时间
	 */
	public String getPeixunshijian() {
		return peixunshijian;
	}
				
	
	/**
	 * 设置：培训结果
	 */
	 
	public void setPeixunjieguo(String peixunjieguo) {
		this.peixunjieguo = peixunjieguo;
	}
	
	/**
	 * 获取：培训结果
	 */
	public String getPeixunjieguo() {
		return peixunjieguo;
	}
				
	
	/**
	 * 设置：培训评分
	 */
	 
	public void setPeixunpingfen(Integer peixunpingfen) {
		this.peixunpingfen = peixunpingfen;
	}
	
	/**
	 * 获取：培训评分
	 */
	public Integer getPeixunpingfen() {
		return peixunpingfen;
	}
				
	
	/**
	 * 设置：记录时间
	 */
	 
	public void setJilushijian(Date jilushijian) {
		this.jilushijian = jilushijian;
	}
	
	/**
	 * 获取：记录时间
	 */
	public Date getJilushijian() {
		return jilushijian;
	}
			
}
