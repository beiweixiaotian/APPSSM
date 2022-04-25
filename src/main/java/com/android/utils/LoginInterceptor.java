package com.android.utils;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception exception)
            throws Exception {
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView view) throws Exception {
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        final String ENC = "UTF-8";
        String fullPath = request.getRequestURI();
        String queryString = request.getQueryString();
        String contextPath = request.getContextPath();
        String controllerPath = fullPath.replace(contextPath, "");

        HttpSession session = request.getSession();
        Object account = session.getAttribute("account");

        if(queryString != null && !queryString.trim().equals("")) {
            queryString = "?" + queryString;
        }

        if(!controllerPath.startsWith("/passport") && account == null) {
            response.sendRedirect(contextPath + "/passport?path=" + URLEncoder.encode(contextPath + controllerPath + queryString, ENC));
        }
        return true;
    }
}