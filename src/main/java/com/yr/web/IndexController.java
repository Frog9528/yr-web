/**
 * @(#)IndexController.java, 2018年4月13日.
 *
 * Copyright 2018 zbj.com, Inc. All rights reserved.
 * ZHUBAJIE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 首页
 * 
 * @title 首页
 * @author yurui
 * @date 2018年4月13日
 * @since v1.0.0
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
