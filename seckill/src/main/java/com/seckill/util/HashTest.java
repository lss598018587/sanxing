package com.seckill.util;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangmiao on 2017/2/21.
 * @create 2017 - 02 - 21 上午10:52
 */

public class HashTest {
//    public static void main(String args[]) {
//        String s1 = new String("zhaoxudong");
//        String s2 = new String("zhaoxudong");
//        System.out.println(s1 == s2);//false
//        System.out.println(s1.equals(s2));//true
//        System.out.println(s1.hashCode());//s1.hashcode()等于s2.hashcode()
//        System.out.println(s2.hashCode());
//        Set hashset = new HashSet();
//        hashset.add(s1);
//        hashset.add(s2);
//        System.out.println(hashset);
//    }
private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int hashCode() {
        return i % 10;
    }

    public final static void main(String[] args) {
        HashTest a = new HashTest();
        HashTest b = new HashTest();
        a.setI(1);
        b.setI(1);
        Set<HashTest> set = new HashSet<HashTest>();
        set.add(a);
        set.add(b);
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(set);
    }
}
