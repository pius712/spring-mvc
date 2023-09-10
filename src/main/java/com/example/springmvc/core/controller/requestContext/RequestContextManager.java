package com.example.springmvc.core.controller.requestContext;

import org.springframework.stereotype.Component;

@Component
public class RequestContextManager {

    private final ThreadLocal<RequestContext> threadLocal = new ThreadLocal<>();

    public void setContext(RequestContext context) {
        threadLocal.set(context);
    }

    public RequestContext getContext() {
        return threadLocal.get();
    }

    public void clearContext() {
        threadLocal.remove();
    }
}
