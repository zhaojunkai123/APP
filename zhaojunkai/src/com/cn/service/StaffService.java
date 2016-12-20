package com.cn.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.dao.StaffMapper;
import com.cn.pojo.Staff;
import com.cn.util.Pager;

@Service("staffService")
public class StaffService {

	 @Resource(name="staffMapper")
	 private StaffMapper staffMapper;
	 
	 public Pager<Staff> findPager(Integer pageno,Integer pagesize){
		 Pager<Staff> pager = new Pager<Staff>();
		 pager.setRows(staffMapper.findPager(pageno, pagesize));
		 pager.setTotal(staffMapper.findTotal());
		return pager;
	 }
}
