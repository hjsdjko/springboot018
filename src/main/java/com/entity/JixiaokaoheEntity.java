package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 绩效考核
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@TableName("jixiaokaohe")
public class JixiaokaoheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JixiaokaoheEntity() {
		
	}
	
	public JixiaokaoheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 考核月份
	 */
					
	private String kaoheyuefen;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaoheriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：考核月份
	 */
	public void setKaoheyuefen(String kaoheyuefen) {
		this.kaoheyuefen = kaoheyuefen;
	}
	/**
	 * 获取：考核月份
	 */
	public String getKaoheyuefen() {
		return kaoheyuefen;
	}
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
