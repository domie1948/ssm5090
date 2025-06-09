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
 * 货物盘点
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-22 14:49:31
 */
@TableName("huowupandian")
public class HuowupandianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuowupandianEntity() {
		
	}
	
	public HuowupandianEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 盘点月份
	 */
					
	private String pandianyuefen;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 盘点数量
	 */
					
	private Integer pandianshuliang;
	
	/**
	 * 差异数量
	 */
					
	private String chayishuliang;
	
	/**
	 * 差异说明
	 */
					
	private String chayishuoming;
	
	/**
	 * 盘点日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pandianriqi;
	
	
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
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：盘点月份
	 */
	public void setPandianyuefen(String pandianyuefen) {
		this.pandianyuefen = pandianyuefen;
	}
	/**
	 * 获取：盘点月份
	 */
	public String getPandianyuefen() {
		return pandianyuefen;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：盘点数量
	 */
	public void setPandianshuliang(Integer pandianshuliang) {
		this.pandianshuliang = pandianshuliang;
	}
	/**
	 * 获取：盘点数量
	 */
	public Integer getPandianshuliang() {
		return pandianshuliang;
	}
	/**
	 * 设置：差异数量
	 */
	public void setChayishuliang(String chayishuliang) {
		this.chayishuliang = chayishuliang;
	}
	/**
	 * 获取：差异数量
	 */
	public String getChayishuliang() {
		return chayishuliang;
	}
	/**
	 * 设置：差异说明
	 */
	public void setChayishuoming(String chayishuoming) {
		this.chayishuoming = chayishuoming;
	}
	/**
	 * 获取：差异说明
	 */
	public String getChayishuoming() {
		return chayishuoming;
	}
	/**
	 * 设置：盘点日期
	 */
	public void setPandianriqi(Date pandianriqi) {
		this.pandianriqi = pandianriqi;
	}
	/**
	 * 获取：盘点日期
	 */
	public Date getPandianriqi() {
		return pandianriqi;
	}

}
