package com.seckill.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangmiao on 2017/2/20.
 * @create 2017 - 02 - 20 下午7:15
 */

public class ListTest {
    static final int N=50000;
    static long timeList(List list){
        long start=System.currentTimeMillis();
        Object o = new Object();
        for(int i=0;i<N;i++)
            list.add(o);
        return System.currentTimeMillis()-start;
    }
    public static void main (String[] arg){
        System.out.println("ArrayList耗时："+timeList(new ArrayList()));
        System.out.println("LinkedList耗时："+timeList(new LinkedList()));

    }
}
