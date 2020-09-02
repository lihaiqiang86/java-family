package com.lee.pattern.creational.singleton;

/**
 * @author lihaiqiang
 * @since 2020/8/27
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        //显示消息
        object.showMessage();

        // 1、懒汉式，线程不安全
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.showMessage();

        // 2、懒汉式，线程安全
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.showMessage();

        // 3、饿汉式
        Singleton3 singleton3 = Singleton3.getInstance();
        singleton3.showMessage();

        // 4、双检锁/双重校验锁（DCL，即 double-checked locking）
        Singleton4 singleton4 = Singleton4.getInstance();
        singleton4.showMessage();

        // 5、登记式/静态内部类
        Singleton5 singleton5 = Singleton5.getInstance();
        singleton5.showMessage();

        // 6.枚举方式
        Singleton6.INSTANCE.showMessage();
    }
}
