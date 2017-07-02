package com.company;

/**
 * Created by ssingh on 6/28/17.
 */
public class MethodCheck{
    public static void main(String args[]){
        DefineMethod dm = new DefineMethod();
        dm.sayHello();
    }
}

class DefineMethod{
    public void sayHello(){
        System.out.println("Hello!");
    }
    private void userWants(String str){
        System.out.println("User said "+ str);
    }
}
