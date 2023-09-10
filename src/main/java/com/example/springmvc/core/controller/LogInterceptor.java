package com.example.springmvc.core.controller;

import com.example.springmvc.core.controller.requestContext.RequestContext;
import com.example.springmvc.core.controller.requestContext.RequestContextManager;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
@Component
@RequiredArgsConstructor
public class LogInterceptor implements HandlerInterceptor {

    private final RequestContextManager contextManager;

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        RequestContext context = contextManager.getContext();
        log.info("request context traceId {}", context.traceId());

        contextManager.clearContext();
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        contextManager.setContext(
                new RequestContext(
                        request.getHeader("trace-id")
                )
        );
        return true;
    }
}
