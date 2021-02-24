package org.ratel.cloud.swagger2;//package com.tangyh.basic.swagger2;
//
//import springfox.documentation.spring.web.paths.RelativePathProvider;
//
//import javax.servlet.ServletContext;
//
///**
// * 相对路径重写
// *
// * @author Ratel-Cloud
// * @version 1.0
// * @date 2021/02/24
// */
//public class ExtRelativePathProvider extends RelativePathProvider {
//    private final String basePath;
//
//    public ExtRelativePathProvider(ServletContext servletContext, String basePath) {
//        super(servletContext);
//        this.basePath = basePath;
//    }
//
//    @Override
//    public String getApplicationBasePath() {
//        String applicationPath = super.applicationPath();
//        if (ROOT.equals(applicationPath)) {
//            applicationPath = "";
//        }
//        return basePath + applicationPath;
//    }
//}
