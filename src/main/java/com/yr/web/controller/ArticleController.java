/**
 * @(#)ArticleController.java, 2018年4月17日.
 *
 * Copyright 2018 zbj.com, Inc. All rights reserved.
 * ZHUBAJIE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yr.web.controller;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 文章页
 * 
 * @title 文章页
 * @author yurui
 * @date 2018年4月17日
 * @since v1.0.0
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    /**
     * 文章列表
     */
    private Map<String, String> articleIdList = new LinkedHashMap<String, String>();
    
    @PostConstruct
    public void init() {
        articleIdList.put("20180417", "20180417");
        articleIdList.put("20180418", "20180418");
    }

    /**
     * 文章页
     */
    @RequestMapping("/{articleId}")
    public ModelAndView article(@PathVariable("articleId") String articleId) {
        if (!articleIdList.containsKey(articleId)) {
            return new ModelAndView("error/404");
        }
        return new ModelAndView("article/" + articleId);
    }
}
