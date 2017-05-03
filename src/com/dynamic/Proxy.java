package com.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/1.
 */
public class Proxy implements InvocationHandler{
    Object object = null;

    public Proxy(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this,object,args);
        return result;
    }
}
