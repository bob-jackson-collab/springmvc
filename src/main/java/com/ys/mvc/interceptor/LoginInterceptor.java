package com.ys.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yunshan on 17/9/14.
 */
public class LoginInterceptor implements HandlerInterceptor {

    private List<String> allowedPass;

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String url = httpServletRequest.getRequestURL().toString();

//        User user = (User) httpServletRequest.getSession().getAttribute("user");

//        if (user != null) {
//            return true;
//        }

        for (String allowedPas : allowedPass) {
            if (url.endsWith(allowedPas)) {
                return true;
            }
        }

//        httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "jsp/login.jsp");
        System.out.println("handle before");
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("handle after");
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

    public List<String> getAllowedPass() {
        return allowedPass;
    }

    public void setAllowedPass(List<String> allowedPass) {
        this.allowedPass = allowedPass;
    }
}
