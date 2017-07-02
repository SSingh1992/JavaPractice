package com.company.com.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssingh on 6/23/17.
 */
public class MapTest {
    public static void main(String args[]){
        List l = new ArrayList();
        l.add(10);
        l.add(1, "hello");
        l.add("sanket");
        l.forEach(lt->System.out.println(lt));

        System.out.println(l.get(1)+" +");

    }
}
