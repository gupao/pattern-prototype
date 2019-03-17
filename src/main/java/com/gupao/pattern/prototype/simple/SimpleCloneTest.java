package com.gupao.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.Date;

/**
 * created by xuyahui on 2019/3/17
 */
public class SimpleCloneTest {

    public static void main(String[] args) {

        // 构造对象A
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setAge(9);
        prototypeA.setName("xiaoming");
        prototypeA.setHobbies(new ArrayList());
        // 克隆对象，比较结果
        Client client = new Client();
        ConcretePrototypeA  prototypeACopy = (ConcretePrototypeA)client.startClone(prototypeA);
        System.out.println("原始对象中引用类型的值："+ prototypeA.getHobbies());
        System.out.println("克隆对象中引用类型的值："+ prototypeACopy.getHobbies());
        System.out.println("对象地址比较：" + (prototypeA.getHobbies() == prototypeACopy.getHobbies()));


        // 构造对象B
        ConcretePrototypeB prototypeB = new ConcretePrototypeB();
        prototypeB.setAge(new Date());
         // 克隆对象，比较结果
        ConcretePrototypeB prototypeBCopy = (ConcretePrototypeB)client.startClone(prototypeB);
        System.out.println("原始对象中引用类型的值："+ prototypeB.getAge());
        System.out.println("克隆对象中引用类型的值："+ prototypeBCopy.getAge());
        System.out.println("对象地址比较：" + (prototypeB.getAge() == prototypeBCopy.getAge()));


    }

}
