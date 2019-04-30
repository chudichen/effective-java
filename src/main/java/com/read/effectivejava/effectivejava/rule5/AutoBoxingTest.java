package com.read.effectivejava.effectivejava.rule5;

/**
 * 基本类型和包装类在性能上有着明显的差别。
 *
 * @author Michael Chu
 * @date 2019-04-29 19:10
 */
public class AutoBoxingTest {

    private static void boxedPrimitiveTypeTest() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("count : " + sum);
    }

    private static void primitiveTypeTest() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("count : " + sum);
    }

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        boxedPrimitiveTypeTest();
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

        startTime=System.currentTimeMillis();
        primitiveTypeTest();
        endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }
}
