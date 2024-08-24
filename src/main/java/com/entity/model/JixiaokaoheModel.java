package com.entity.model;

import com.entity.JixiaokaoheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 绩效考核
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public class JixiaokaoheModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 绩效目标
	 */
	
	private String jixiaomubiao;
		
	/**
	 * 绩效评定
	 */
	
	private String jixiaopingding;
		
	/**
	 * 绩效奖励
	 */
	
	private Integer jixiaojiangli;
		
	/**
	 * 考核日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoheriqi;
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：绩效目标
	 */
	 
	public void setJixiaomubiao(String jixiaomubiao) {
		this.jixiaomubiao = jixiaomubiao;
	}
	
	/**
	 * 获取：绩效目标
	 */
	public String getJixiaomubiao() {
		return jixiaomubiao;
	}
				
	
	/**
	 * 设置：绩效评定
	 */
	 
	public void setJixiaopingding(String jixiaopingding) {
		this.jixiaopingding = jixiaopingding;
	}
	
	/**
	 * 获取：绩效评定
	 */
	public String getJixiaopingding() {
		return jixiaopingding;
	}
				
	
	/**
	 * 设置：绩效奖励
	 */
	 
	public void setJixiaojiangli(Integer jixiaojiangli) {
		this.jixiaojiangli = jixiaojiangli;
	}
	
	/**
	 * 获取：绩效奖励
	 */
	public Integer getJixiaojiangli() {
		return jixiaojiangli;
	}
				
	
	/**
	 * 设置：考核日期
	 */
	 
	public void setKaoheriqi(Date kaoheriqi) {
		this.kaoheriqi = kaoheriqi;
	}
	
	/**
	 * 获取：考核日期
	 */
	public Date getKaoheriqi() {
		return kaoheriqi;
	}
			
}
