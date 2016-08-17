package com.fan.controller;

import java.util.ArrayList;
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

import com.fan.dto.ArticleDTO;
import com.fan.model.Article;
import com.fan.service.IArticleService;
import com.fan.web.controller.BaseController;

@Controller
@RequestMapping("/article")
public class ArticleController extends BaseController{
	@Autowired
	private IArticleService articleService;
	
	@RequestMapping(value = "/ArticleAdd")
	public String articleAdd(String title,String content,int operatorId,String abContent) {
		Article article=new Article();
		article.setAbContent(abContent);
		article.setContent(content);
		article.setOperatorId(operatorId);
		article.setTitle(title);
		//article.setId(id);
		articleService.save(article);
		return "article/ArticleAdd";
	}
	
	@RequestMapping(value = "/ArticleManage", method = RequestMethod.GET)
	public String index(@RequestParam(value = "page", required = false) Integer curPage, Model model) {
		if (curPage == null) curPage = 1;
		List<Article> datas = articleService.load(new String[] {"id", "title", "content","time"}, "id", "asc", curPage, PAGE_LIMIT);
		long totalSize = articleService.count();
		int totalPage = (int) Math.ceil(totalSize * 1.0 / PAGE_LIMIT);
		model.addAttribute("datas", datas);
		model.addAttribute("totalSize", totalSize);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("curPage", curPage);
		return "article/ArticleManage";
	}
	
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public String getContent(@RequestParam(value = "page", required = false) Integer curPage, Model model) {
		if (curPage == null) curPage = 1;
		List<Article> datas = articleService.load(new String[] {"id", "title", "content","time","abContent"}, "id", "asc", curPage, PAGE_LIMIT);
		long totalSize = articleService.count();
		int totalPage = (int) Math.ceil(totalSize * 1.0 / PAGE_LIMIT);
		model.addAttribute("datas", datas);
		model.addAttribute("totalSize", totalSize);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("curPage", curPage);
		return "homePage/blog";
	}
	
	@RequestMapping(value = "/blogDetail", method = RequestMethod.GET)
	public String getContentDe(@RequestParam(value = "page", required = false) Integer curPage, Model model,int id) {
		if (curPage == null) curPage = 1;
		Article article = articleService.find(id);
		List<Article> datas=new ArrayList<Article>();
		datas.add(article);
		long totalSize = articleService.count();
		int totalPage = (int) Math.ceil(totalSize * 1.0 / PAGE_LIMIT);
		model.addAttribute("datas", datas);
		model.addAttribute("totalSize", totalSize);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("curPage", curPage);
		return "homePage/blogDetail";
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute ArticleDTO dto) {
		articleService.save(dto.toModel());
		return "{}";
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String show(@RequestParam("id") int id) {
		Article data = articleService.find(id, new String[] {"id", "name", "roleId"});
		return gson.toJson(data);
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute ArticleDTO dto, Model model) {
		articleService.update(dto.toModel());
		return "{}";
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public String destory(@RequestParam("id") int id) {
		articleService.delete(id);
		return "{}";
	}
	
	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.POST)
	public String deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (int id : ids) {
			articleService.delete(id);
		}
		return "{}";
	}
}
