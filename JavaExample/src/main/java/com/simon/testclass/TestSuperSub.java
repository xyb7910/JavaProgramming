package com.simon.testclass;

public class TestSuperSub {
    /*
    子类不继承父类的构造器，只能调用
    父类的构造器有构造参数，子类的构造器必须显式 通过super()调用父类的构造器
    父类的构造器没有构造参数，系统会自动调用父类的无参构造器
     */
    public static void main(String[] args) {
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(100);

        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);
    }
}
