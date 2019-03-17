package com.gupao.pattern.prototype.apply;

/**
 * created by xuyahui on 2019/3/17
 */
public class Student implements Cloneable{

    private String id;
    private String name;
    private String sex;
    private int age;
    private float score;
    private float height;
    private float witght;

    @Override
    public Student clone(){
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWitght() {
        return witght;
    }

    public void setWitght(float witght) {
        this.witght = witght;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", height=" + height +
                ", witght=" + witght +
                '}';
    }
}
