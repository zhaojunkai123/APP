package com.cn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cn.pojo.Staff;
import com.cn.service.StaffService;
import com.cn.util.Pager;

@Controller
public class StaffController {

	@Resource(name = "staffService")
	private StaffService staffService;
	
	@RequestMapping("staffController_pager")
	public ModelAndView Pager(@RequestParam(value = "page", required = true)Integer page,
	@RequestParam(value = "rows", required = true)Integer rows){
		Integer pageno = (page - 1) * rows;
		Integer pagesize = page * rows;
		Pager<Staff> pager=staffService.findPager(pageno, pagesize);
		ModelAndView modelAndView = new ModelAndView("stafflist");
		modelAndView.addObject("staffs", pager.getRows());
		modelAndView.addObject("total", pager.getTotal());
		modelAndView.addObject("page", page);
		return modelAndView;
	}
}
