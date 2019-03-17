package com.gupao.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * created by xuyahui on 2019/3/17
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {

    public JinGuBang jinGuBang;


    // 深克隆方法中字节流读取对象时，要调用此构造方法创建对象
    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    /**
     * 深克隆实现方法
     * @return
     */
    public QiTianDaSheng deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 浅克隆实现方法
     * @param target
     * @return
     */
    public QiTianDaSheng shallowClone(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.weight;
        qiTianDaSheng.birthday = target.birthday;
        qiTianDaSheng.jinGuBang = target.jinGuBang;
        return qiTianDaSheng;
    }

}
