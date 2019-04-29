package com.neo.hello.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter2 implements Filter {

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
    }

    @Override
    public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain) throws IOException, ServletException
    {
        HttpServletRequest request=(HttpServletRequest) srequest;
        System.out.println(("this is my Filter222222, url:"+request.getRequestURI()));
        filterChain.doFilter(srequest, sresponse);
    }

    @Override
    public void destroy(){
        //// TODO: 4/26/2019
    }
}
