/**
 * Copyright (C), 2018-2018, 公司
 * FileName: TemplatesTest
 * Author:   刘伟成
 * Date:     2018/11/20 21:57
 * Description: 模板
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.atguigu;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈模板〉
 *
 * @author 刘伟成
 * @create 2018/11/20
 * @since 1.0.0
 */
public class TemplatesTest {

    private Object list;


    //模板六 prsf
    private static final HelloWorld HELLO = new HelloWorld();

    //变形 psfi / psfs
    public static final int num = 1;
    public static final String num2 = "傻逼";
    //模板一 psvm
    public static void main(String[] args) {

        //模板二 sout
        System.out.println("hello!");
        //变形 soutp / soutm / soutv /xxx.out
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);

        //模板三 fori
        String [] arr = new String[]{"Tom","Jerry","HanMeiMei","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);

        }
        //变形 iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }

        //模板四 list.for
        ArrayList list = new ArrayList();
        list.add("111");
        list.add("123");
        list.add("222");

        for (Object o : list) {
            System.out.println("o = " + o.toString());
//            System.out.println("o = " + o);

        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("i = " + i);
        }


    }

    public void method () {

        System.out.println("TemplatesTest.method");

        //模板五 ifn
        if (list == null) {

        }

        if (list != null) {

        }

        if (list != null) {

        }
        if (list == null) {

        }
    }
}