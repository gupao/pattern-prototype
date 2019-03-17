package com.gupao.pattern.prototype.simple;

/**
 * 浅克隆客户端
 *
 * created by xuyahui on 2019/3/17
 */
public class Client {

//    private Prototype prototype;

//    public Client(Prototype prototype) {
//        this.prototype = prototype;
//    }

    public Prototype startClone(Prototype prototype){
        return (Prototype)prototype.clone();
    }
}
