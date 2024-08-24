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
 * 培训结果
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
@TableName("peixunjieguo")
public class PeixunjieguoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeixunjieguoEntity() {
		
	}
	
	public PeixunjieguoEntity(T t) {
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
