package com.cn.util;

import java.util.List;

public class Pager<T> {
	//easyui Լ���ı���
     private int total;   //��ҳ�ܼ�¼��
     private List<T> rows; //��ҳ����
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
     
     
	
}
