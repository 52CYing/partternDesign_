package com.qiweichao.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * XSS 过滤器
 *
 * @author chenjunfeng
 * @date 2018/9/28 下午4:04
 */
public class XssFilter implements Filter {

    private Logger log = LoggerFactory.getLogger(XssFilter.class);

    FilterConfig fc = null;

    private List<String> ignores;



    public void init(FilterConfig filterConfig) throws ServletException {
        this.fc = filterConfig;
        ignores = Arrays.asList(filterConfig.getInitParameter("ignores").split(","));
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc) throws IOException, ServletException {
        String reqURL = ((HttpServletRequest) req).getServletPath();
        if (ignores.contains(reqURL)) {
            fc.doFilter(req, resp);
        } else {
            fc.doFilter(new XssHttpServletRequestWrapper((HttpServletRequest) req), resp);
        }

    }

    public void destroy() {
        fc = null;
    }
}
