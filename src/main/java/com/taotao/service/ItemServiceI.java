/**
 * 
 */
package com.taotao.service;

import com.taotao.model.EasyUIDataGridResult;
import com.taotao.model.Item;

/**
 * @author HuangQinJian 下午12:01:51 2017年4月2日
 */
public interface ItemServiceI {
	public Item getItemById(Long id);

	public EasyUIDataGridResult getItemList(int page, int rows);
}
