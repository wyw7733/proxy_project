package com.dynamic;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Administrator on 2017/5/1.
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new SubjectImp();
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handlers = new Proxy(subject);
        Subject proxy = (Subject) java.lang.reflect.Proxy.newProxyInstance(loader,interfaces,handlers);
        proxy.oprate();
        System.out.println(proxy.getClass().getName());
        System.out.println("4444");
    }
}
