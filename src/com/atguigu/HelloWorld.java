/**
 * Copyright (C), 2018-2018, 公司
 * FileName: HelloWorld
 * Author:   刘伟成
 * Date:     2018/10/23 20:58
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.atguigu;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 */
public class HelloWorld {


    private static String str;
        public static void main(String[] args) {

        List list = getList();
        System.out.println("测试！！！");
        System.out.println("测试list！！！" + list.size());
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
    }


    private static List getList() {


        List list1 = new ArrayList<String>();
        Date date = new Date();
        list1.add(null);
        return list1;
    }

    private void getppt() {
        this.str = "10";
    }

}