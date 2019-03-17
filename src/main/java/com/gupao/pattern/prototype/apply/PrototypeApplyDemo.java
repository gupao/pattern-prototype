package com.gupao.pattern.prototype.apply;

/**
 * created by xuyahui on 2019/3/17
 */
public class PrototypeApplyDemo {

    public static void main(String[] args) {

        Student student = new Student();
        student.setId("1");
        student.setName("夏天");
        student.setAge(8);
        student.setHeight(175);
        student.setWitght(60.6f);
        student.setScore(99.5f);
        student.setSex("女");
        System.out.println("原始学生：" + student);

        Student studentShallowCopy = student.clone();
        System.out.println("浅克隆的对象" + studentShallowCopy);
        System.out.println("克隆前后对象比较：" + student.equals(studentShallowCopy));

    }

}
