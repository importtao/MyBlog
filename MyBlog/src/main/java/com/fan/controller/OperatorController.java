package com.fan.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fan.dto.OperatorDTO;
import com.fan.model.Operator;
import com.fan.service.IOperatorService;
import com.fan.web.controller.BaseController;

@Controller
@RequestMapping("/operator")
public class OperatorController extends BaseController {
	@Autowired
	private IOperatorService operatorService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@RequestParam(value = "page", required = false) Integer curPage, Model model) {
		if (curPage == null) curPage = 1;
		List<Operator> datas = operatorService.load(new String[] {"id", "name", "roleId"}, "id", "asc", curPage, PAGE_LIMIT);
		long totalSize = operatorService.count();
		int totalPage = (int) Math.ceil(totalSize * 1.0 / PAGE_LIMIT);
		model.addAttribute("datas", datas);
		model.addAttribute("totalSize", totalSize);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("curPage", curPage);
		return "operator/index";
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute OperatorDTO dto) {
		operatorService.save(dto.toModel());
		return "{}";
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String show(@RequestParam("id") int id) {
		Operator data = operatorService.find(id, new String[] {"id", "name", "roleId"});
		return gson.toJson(data);
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute OperatorDTO dto, Model model) {
		operatorService.update(dto.toModel());
		return "{}";
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public String destory(@RequestParam("id") int id) {
		operatorService.delete(id);
		return "{}";
	}
	
	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.POST)
	public String deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (int id : ids) {
			operatorService.delete(id);
		}
		return "{}";
	}
}
