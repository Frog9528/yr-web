/**
 * @(#)AboutController.java, 2018年4月14日.
 *
 * Copyright 2018 zbj.com, Inc. All rights reserved.
 * ZHUBAJIE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yr.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * About页
 * 
 * @title About页
 * @author yurui
 * @date 2018年4月14日
 * @since v1.0.0
 */
@Controller
@RequestMapping("/about")
public class AboutController {
    /**
     * 关于页面
     * 
     * @return
     */
    @RequestMapping("")
    public ModelAndView about() {
        return new ModelAndView("about");
    }
}
