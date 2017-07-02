package com.company;

import javax.xml.crypto.Data;

/**
 * Created by ssingh on 6/24/17.
 */
public class TestRelationship {
    public static void main(String[] args){
        Dell d = new Dell();
        d.isDell();
        d.isLaptop();
        Hp hp = new Hp();
        hp.isHp();
        hp.isLaptop();
        hp.save();
        hp.imp();
        hp.isFormat(10);
        if (d instanceof Laptop){
            System.out.println("Dell is an instance of Laptop");
        }
        if (hp instanceof Formatable){
            System.out.println("Dell is an instance of Formatable");
        }
    }
}

class Dell implements Laptop{
    void isDell(){
        System.out.println("This is a Dell Laptop");
    }
    @Override
    public void isLaptop() {
        System.out.println("Dell IS-A Laptop");
    }
}

class Hp extends Formatable implements Laptop{
    void isHp(){
        System.out.println("This is a Hp Laptop");
    }
    @Override
    public void isLaptop(){
        System.out.println("Hp IS-A Laptop");
    }
    HardDisk hd = new HardDisk();
    public void save (){
        hd.writeData();
    }
    @Override
    void imp() {
        System.out.println("imp");
    }
    @Override
    void isFormat(int Data) {
        super.isFormat(Data);
        //Don't do this.isFormat(Data) will go in recursion
        System.out.println(Data+" From Hp class");
    }
}

interface Laptop{
    void isLaptop();
}

abstract class Formatable{
    abstract void imp();
    void isFormat(int Data){
        System.out.println(Data+" from Formatable");
    }
}

class HardDisk{
    public void writeData(){
        System.out.println("Write a data");
    }
}