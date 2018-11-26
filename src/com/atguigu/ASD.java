/**
 * Copyright (C), 2018-2018, 公司
 * FileName: ASD
 * Author:   刘伟成
 * Date:     2018/11/8 22:59
 * Description: AAA
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
 * 〈一句话功能简述〉<br> 
 * 〈AAA〉
 *
 * @author 刘伟成
 * @create 2018/11/8
 * @since 1.0.0
 */
public class ASD {
    public static void main(String[] args) {

        List list = getList();
        System.out.println("测试！！！");
        System.out.println("测试list！！！" + list.size());
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        System.out.println(111111);
    }

    private static List getList() {

        List list1 = new ArrayList<String>();
        Date date = new Date();
        list1.add("hh");
        System.out.println("测试！！！");
        return list1;
    }

}