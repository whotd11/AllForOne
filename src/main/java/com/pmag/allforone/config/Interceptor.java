package com.pmag.allforone.config;

import org.springframework.stereotype.Component;

@Component
public class Interceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // You can do your processing here
        return true;
    }
}
