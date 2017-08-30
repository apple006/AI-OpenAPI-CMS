package cn.anline.www.home.controller;

import act.app.ActionContext;
import cn.anline.www.AnnBase;
import org.osgl.mvc.annotation.After;
import org.osgl.mvc.annotation.Before;

import javax.inject.Inject;

/**
 * 前台总基类
 */
public class Base extends AnnBase {

    @Inject
    ActionContext actionContext;
    /**
     * 前台全局构造器
     * 框架构造器
     */
    @Before
    public void _init(){
        System.out.println("---前台全局构造器已执行---");
        actionContext.renderArg("asset",_AssetPath());
    }

    /**
     * 前台主题资源根路径
     * 判断是否手机版做决策
     * @return
     */
    public String _AssetPath(){
        return "/asset/home/star/";
    }

    /**
     * 前台主体视图文件路径
     * 判断是否手机版做决策
     * @return
     */
    public String _ThemePath(){
        return "/skins/star/";
    }
    /**
     * 前台全局析构器
     * 框架析构器
     */
    @After
    public void _uninit(){
        System.out.println("---前台全局析构器已执行---");
    }
}
