/**
 * 
 */
package com.taotao.pojo;

import java.util.List;

/**
 * @author HuangQinJian ����3:35:49 2017��4��2��
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
