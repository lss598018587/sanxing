package com.seckill.util;

/**
 * @author wangmiao on 2017/2/21.
 * @create 2017 - 02 - 21 上午11:47
 */

public class finalTest extends wmTest{

    public static final int n = 100;

    public static void main(String [] arg){

        wmTest finalTest = new finalTest();
        finalTest.talk();
    }
    public void test2() {
        final int a;     //final空白,在需要的时候才赋值
        final int b = 4;    //局部常量--final用于局部变量的情形
        final int c;    //final空白,一直没有给赋值.
        a = 3;
        //a=4;    //出错,已经给赋过值了.
       // b=2; //出错,已经给赋过值了.
        c=4;
    }

    @Override
    public void talk() {
        System.out.println("qwe");

    }
}
