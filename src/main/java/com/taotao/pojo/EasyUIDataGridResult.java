/**
 * 
 */
package com.taotao.pojo;

import java.util.List;

/**
 * @author HuangQinJian 下午3:35:49 2017年4月2日
 */
public class EasyUIDataGridResult {
	private long total;
	private List<?> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
