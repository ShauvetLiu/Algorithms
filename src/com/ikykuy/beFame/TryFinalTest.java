package com.ikykuy.beFame;

import java.util.Comparator;

public class TryFinalTest {

    //测试 修改值类型 static int f() {
    public static void main(String[] args) {
        int a = TryFinalTest.testIntReturn();
        System.out.println(a);
        int[] b = TryFinalTest.testIntArrayReturn();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
    static int testIntReturn() {
        int ret = 0;
        try {
            return ret;
        } finally {
            //返回0，finally内的修改效果不起作用
            ret++;
            System.out.println("finally } 执行");
        }
    }
     // 测试 修改引用类型 static int[] f2(){

    static int[] testIntArrayReturn() {

        int[] ret = new int[]{0};
        try {
            return ret; // 返回 [1]，finally 内的修改效果起了作用
        } finally {
            ret[0]++;
            System.out.println("finally 执行");
        }
    }
}
