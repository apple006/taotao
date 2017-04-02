/**
 * 
 */
package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.dao.ItemMapper;
import com.taotao.model.Item;
import com.taotao.pojo.EasyUIDataGridResult;
import com.taotao.service.ItemServiceI;

/**
 * @author HuangQinJian 下午12:15:18 2017年4月2日
 */
@Controller
public class ItemController {
	@Autowired
	private ItemServiceI itemServiceI;

	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public Item getItemById(@PathVariable Long itemId) {
		Item item = itemServiceI.getItemById(itemId);
		return item;
	}

	/*@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		EasyUIDataGridResult result = itemServiceI.getItemList(page, rows);
		return result;
	}*/
}
