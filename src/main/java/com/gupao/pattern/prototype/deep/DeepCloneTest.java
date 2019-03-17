package com.gupao.pattern.prototype.deep;

/**
 * created by xuyahui on 2019/3/17
 */
public class DeepCloneTest {

    public static void main(String[] args) {

        QiTianDaSheng shallow = new QiTianDaSheng();
        QiTianDaSheng shallowCopyObj = shallow.shallowClone(shallow);
        System.out.println("浅克隆对象引用类型比较：" + (shallow.jinGuBang == shallowCopyObj.jinGuBang));


        try {
            QiTianDaSheng deep = new QiTianDaSheng();
            QiTianDaSheng deepCopyObj = (QiTianDaSheng)deep.clone();
            System.out.println("深克隆对象引用类型比较："+ (deep.jinGuBang == deepCopyObj.jinGuBang));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}
