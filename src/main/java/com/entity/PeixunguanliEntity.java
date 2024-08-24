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
 * 培训管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@TableName("peixunguanli")
public class PeixunguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeixunguanliEntity() {
		
	}
	
	public PeixunguanliEntity(T t) {
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
	 * 培训项目
	 */
					
	private String peixunxiangmu;
	
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
	 * 设置：培训项目
	 */
	public void setPeixunxiangmu(String peixunxiangmu) {
		this.peixunxiangmu = peixunxiangmu;
	}
	/**
	 * 获取：培训项目
	 */
	public String getPeixunxiangmu() {
		return peixunxiangmu;
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
