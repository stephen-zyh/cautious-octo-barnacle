package com.example.demo;

public class Test {
    public static void main(String[] args){
        Student s = new Student("张三", "男", 20, 11203, 80, 70, 90);
        System.out.println(s);
        isAdult(s);//当子类对象调用一个方法时，会优先在子类中查找，然后才回去父类中查找。
        // 如果子类调用了父类的方法method1,而method1又调用了method2，那么这个method2还是会优先在子类中查找，找不到才会去父类中查找

    }
    public static boolean isAdult(Person a){
        if(a.getAge() >= 18) {
            System.out.println(a.getName() + "是一个成年人");
            return true;
        }
        else {
            System.out.println(a.getName() + "不是一个成年人");
            return false;
        }
    }
}
