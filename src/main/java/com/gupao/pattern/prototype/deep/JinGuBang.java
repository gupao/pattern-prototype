package com.gupao.pattern.prototype.deep;

import java.io.Serializable;

/**
 * created by xuyahui on 2019/3/17
 */
public class JinGuBang implements Serializable {// 实现序列化接口

    private float h = 100;
    private float w = 10;

    private void big(){
        this.h *= 2;
        this.w *= 2;
    }

    private void small(){
        this.h /= 2;
        this.w /= 2;
    }

}
