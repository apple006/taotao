package com.taotao.dao;

import java.util.List;

import com.taotao.model.Item;

public interface ItemMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Item record);

	int insertSelective(Item record);

	Item selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Item record);

	int updateByPrimaryKey(Item record);

	List<Item> getAllItems();
}