package com.wyw;

/**
 * Created by Administrator on 2017/5/1.
 */
public class Proxy implements Subject {
    private Subject subject;
    @Override
    public void oprate() {
        System.out.println("代理执行之前");
        this.subject.oprate();
        System.out.println("代理执行之后");
    }

    public Proxy(Subject subject){
        this.subject = subject;
    }
}
