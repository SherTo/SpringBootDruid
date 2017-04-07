package com.phyl;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by xh on 2017/4/7.
 */
@WebServlet(urlPatterns = "/druid/*",
        initParams = {@WebInitParam(name = "allow", value = "127.0.0.1"),//访问白名单
                @WebInitParam(name = "deny", value = "192.168.0.121"),//访问黑名单
                @WebInitParam(name = "loginUsername", value = "admin"),//登录名
                @WebInitParam(name = "loginPassword", value = "123456"),//登录密码
                @WebInitParam(name = "resetEnable", value = "false")})//禁止页面reset all

public class DruidServlet extends StatViewServlet{
}
