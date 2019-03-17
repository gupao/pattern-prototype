package com.gupao.pattern.prototype.simple;

import java.util.Date;

/**
 * 浅克隆对象实体B
 *
 * created by xuyahui on 2019/3/17
 */
public class ConcretePrototypeB implements Prototype{

    private Date age;

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeB prototypeB = new ConcretePrototypeB();
        prototypeB.setAge(this.age);
        return prototypeB;
    }
}
