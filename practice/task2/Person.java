package com.example.demo;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    public String gender;

    public Person(){};
    public Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
        public String toString() {
            return "[姓名：" + name + ", 性别：" + gender + ", 年龄：" + age + "]";
        }
}
class Student extends Person{
    private long number;
    private int phi;
    private int eng;
    private int comp;
    private int[] num;
    public Student(){};
    public Student(String name, String gender, int age, long number, int phi, int eng, int comp){
        super(age, name, gender);
        this.number = number;
        this.phi = phi;
        this.comp = comp;
        this.eng = eng;
    }
    public int getPhi(){
        return phi;
    }

    public void setPhi(int phi) {
        this.phi = phi;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
    public double avg(){
        return (getComp() + getEng() + getPhi())/3;
    }
    public int max(){
        int[] intArray = new int[] {eng, phi, comp};
        Arrays.sort(intArray);
        return intArray[intArray.length - 1];
    }
    public int min(){
        int[] intArray = new int[] {eng, phi, comp};
        Arrays.sort(intArray);
        return intArray[0];
    }
    public String toString(){
        return "学号："+getNumber()+", 姓名："+getName()+
                ", 性别："+getGender()+", 年龄："+getAge()+", 平均分："+avg()+",最高分："+max()+", 最低分："+min();
    }
}
