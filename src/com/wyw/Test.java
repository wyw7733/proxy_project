package com.wyw;

/**
 * Created by Administrator on 2017/5/1.
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new Delete();
        Proxy proxy = new Proxy(subject);
        proxy.oprate();
    }
}
