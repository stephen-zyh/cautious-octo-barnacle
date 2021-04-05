package com.example.demo;

public class Player {
    private int number = 0;
    private String name;

    public Player(String name) {
        super();
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getOut(){
        return number;
    }
    public void setOut(int number){
        this.number = number;
    }
    @Override//重写
    public String toString(){
        return "Player[name=" + name +",number =" + number +"]";
    }
}
