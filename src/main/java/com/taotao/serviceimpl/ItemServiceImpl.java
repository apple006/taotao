/**
 * 
 */
package com.taotao.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.dao.ItemMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.model.Item;
import com.taotao.pojo.EasyUIDataGridResult;
import com.taotao.pojo.ItemExample;
import com.taotao.pojo.Items;
import com.taotao.service.ItemServiceI;

/**
 * @author HuangQinJian 下午12:06:59 2017年4月2日
 */
@Service("itemService")
public class ItemServiceImpl implements ItemServiceI {
	@Autowired
	private ItemMapper itemMapper;
	/*@Autowired(required = true)
	private TbItemMapper mapper;*/

	public Item getItemById(Long id) {
		Item item = itemMapper.selectByPrimaryKey(id);
		return item;
	}

	/*public EasyUIDataGridResult getItemList(int page, int rows) {
		ItemExample example = new ItemExample();
		PageHelper.startPage(page, rows);
		List<Items> list = mapper.selectByExample(example);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(list);
		PageInfo<Items> pageInfo = new PageInfo<Items>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}*/
}
