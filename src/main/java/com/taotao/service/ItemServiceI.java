/**
 * 
 */
package com.taotao.service;

import com.taotao.model.Item;
import com.taotao.pojo.EasyUIDataGridResult;

/**
 * @author HuangQinJian ����12:01:51 2017��4��2��
 */
public interface ItemServiceI {
	public Item getItemById(Long id);

	/*public EasyUIDataGridResult getItemList(int page, int rows);*/
}
