package com.entity.model;

import com.entity.HuowupandianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 货物盘点
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-22 14:49:31
 */
public class HuowupandianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pandianriqi;
				
	
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
