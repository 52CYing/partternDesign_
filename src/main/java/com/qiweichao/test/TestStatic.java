package com.qiweichao.test;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Created on 2019/4/18.
 *
 * @author 千秋
 */
public class TestStatic {
    private static String name;


    public static void main(String[] args) {
        char str = '<';
        System.out.println(str);
        System.out.println(StringEscapeUtils.escapeSql("<"));
    }
}
