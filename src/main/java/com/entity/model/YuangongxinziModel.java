package com.entity.model;

import com.entity.YuangongxinziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工薪资
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-27 21:11:09
 */
public class YuangongxinziModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 应上班天数
	 */
	
	private Integer yingshangbantianshu;
		
	/**
	 * 实际上班天数
	 */
	
	private Integer shijishangbantianshu;
		
	/**
	 * 加班总时长
	 */
	
	private Integer jiabanzongshizhang;
		
	/**
	 * 基本工资
	 */
	
	private Integer jibengongzi;
		
	/**
	 * 加班工资
	 */
	
	private Integer jiabangongzi;
		
	/**
	 * 绩效奖金
	 */
	
	private Integer jixiaojiangjin;
		
	/**
	 * 其他补助
	 */
	
	private Integer qitabuzhu;
		
	/**
	 * 扣款金额
	 */
	
	private Integer koukuanjine;
		
	/**
	 * 扣款原因
	 */
	
	private String koukuanyuanyin;
		
	/**
	 * 实发工资
	 */
	
	private Integer shifagongzi;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：应上班天数
	 */
	 
	public void setYingshangbantianshu(Integer yingshangbantianshu) {
		this.yingshangbantianshu = yingshangbantianshu;
	}
	
	/**
	 * 获取：应上班天数
	 */
	public Integer getYingshangbantianshu() {
		return yingshangbantianshu;
	}
				
	
	/**
	 * 设置：实际上班天数
	 */
	 
	public void setShijishangbantianshu(Integer shijishangbantianshu) {
		this.shijishangbantianshu = shijishangbantianshu;
	}
	
	/**
	 * 获取：实际上班天数
	 */
	public Integer getShijishangbantianshu() {
		return shijishangbantianshu;
	}
				
	
	/**
	 * 设置：加班总时长
	 */
	 
	public void setJiabanzongshizhang(Integer jiabanzongshizhang) {
		this.jiabanzongshizhang = jiabanzongshizhang;
	}
	
	/**
	 * 获取：加班总时长
	 */
	public Integer getJiabanzongshizhang() {
		return jiabanzongshizhang;
	}
				
	
	/**
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：加班工资
	 */
	 
	public void setJiabangongzi(Integer jiabangongzi) {
		this.jiabangongzi = jiabangongzi;
	}
	
	/**
	 * 获取：加班工资
	 */
	public Integer getJiabangongzi() {
		return jiabangongzi;
	}
				
	
	/**
	 * 设置：绩效奖金
	 */
	 
	public void setJixiaojiangjin(Integer jixiaojiangjin) {
		this.jixiaojiangjin = jixiaojiangjin;
	}
	
	/**
	 * 获取：绩效奖金
	 */
	public Integer getJixiaojiangjin() {
		return jixiaojiangjin;
	}
				
	
	/**
	 * 设置：其他补助
	 */
	 
	public void setQitabuzhu(Integer qitabuzhu) {
		this.qitabuzhu = qitabuzhu;
	}
	
	/**
	 * 获取：其他补助
	 */
	public Integer getQitabuzhu() {
		return qitabuzhu;
	}
				
	
	/**
	 * 设置：扣款金额
	 */
	 
	public void setKoukuanjine(Integer koukuanjine) {
		this.koukuanjine = koukuanjine;
	}
	
	/**
	 * 获取：扣款金额
	 */
	public Integer getKoukuanjine() {
		return koukuanjine;
	}
				
	
	/**
	 * 设置：扣款原因
	 */
	 
	public void setKoukuanyuanyin(String koukuanyuanyin) {
		this.koukuanyuanyin = koukuanyuanyin;
	}
	
	/**
	 * 获取：扣款原因
	 */
	public String getKoukuanyuanyin() {
		return koukuanyuanyin;
	}
				
	
	/**
	 * 设置：实发工资
	 */
	 
	public void setShifagongzi(Integer shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public Integer getShifagongzi() {
		return shifagongzi;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
