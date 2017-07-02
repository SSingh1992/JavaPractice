package com.company.com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String args[]){
        Set<String> s = new HashSet<>();

        s.add("a"); s.add("z"); s.add("s"); s.add("r"); s.add("j"); s.add("1");

        System.out.println(s.add("10"));
        s.forEach(st->System.out.println(st.hashCode()+"-"+st));
        System.out.println("Hash output "+s);

        TreeSet copySet = new TreeSet();
        copySet.addAll(s);
        System.out.println("Tree Set Output "+copySet);

        LinkedHashSet lk = new LinkedHashSet();
        lk.addAll(s);
        System.out.println("Linked output "+lk);

    }
}
