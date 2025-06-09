package com.entity.model;

import com.entity.ZaixiangoutongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 在线沟通
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-22 14:49:31
 */
public class ZaixiangoutongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 沟通内容
	 */
	
	private String goutongneirong;
		
	/**
	 * 沟通时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goutongshijian;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 供应商账号
	 */
	
	private String gongyingshangzhanghao;
		
	/**
	 * 供应商名称
	 */
	
	private String gongyingshangmingcheng;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：沟通内容
	 */
	 
	public void setGoutongneirong(String goutongneirong) {
		this.goutongneirong = goutongneirong;
	}
	
	/**
	 * 获取：沟通内容
	 */
	public String getGoutongneirong() {
		return goutongneirong;
	}
				
	
	/**
	 * 设置：沟通时间
	 */
	 
	public void setGoutongshijian(Date goutongshijian) {
		this.goutongshijian = goutongshijian;
	}
	
	/**
	 * 获取：沟通时间
	 */
	public Date getGoutongshijian() {
		return goutongshijian;
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
	 * 设置：供应商账号
	 */
	 
	public void setGongyingshangzhanghao(String gongyingshangzhanghao) {
		this.gongyingshangzhanghao = gongyingshangzhanghao;
	}
	
	/**
	 * 获取：供应商账号
	 */
	public String getGongyingshangzhanghao() {
		return gongyingshangzhanghao;
	}
				
	
	/**
	 * 设置：供应商名称
	 */
	 
	public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
		this.gongyingshangmingcheng = gongyingshangmingcheng;
	}
	
	/**
	 * 获取：供应商名称
	 */
	public String getGongyingshangmingcheng() {
		return gongyingshangmingcheng;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
