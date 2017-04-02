package com.taotao.mapper;

import com.taotao.pojo.Items;
import com.taotao.pojo.ItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemMapper {
	int countByExample(ItemExample example);

	int deleteByExample(ItemExample example);

	int deleteByPrimaryKey(Long id);

	int insert(Items record);

	int insertSelective(Items record);

	List<Items> selectByExample(ItemExample example);

	Items selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") Items record,
			@Param("example") ItemExample example);

	int updateByExample(@Param("record") Items record,
			@Param("example") ItemExample example);

	int updateByPrimaryKeySelective(Items record);

	int updateByPrimaryKey(Items record);
}