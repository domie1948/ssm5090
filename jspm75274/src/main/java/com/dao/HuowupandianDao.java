package com.dao;

import com.entity.HuowupandianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowupandianVO;
import com.entity.view.HuowupandianView;


/**
 * 货物盘点
 * 
 * @author 
 * @email 
 * @date 2021-02-22 14:49:31
 */
public interface HuowupandianDao extends BaseMapper<HuowupandianEntity> {
	
	List<HuowupandianVO> selectListVO(@Param("ew") Wrapper<HuowupandianEntity> wrapper);
	
	HuowupandianVO selectVO(@Param("ew") Wrapper<HuowupandianEntity> wrapper);
	
	List<HuowupandianView> selectListView(@Param("ew") Wrapper<HuowupandianEntity> wrapper);

	List<HuowupandianView> selectListView(Pagination page,@Param("ew") Wrapper<HuowupandianEntity> wrapper);
	
	HuowupandianView selectView(@Param("ew") Wrapper<HuowupandianEntity> wrapper);
	
}
