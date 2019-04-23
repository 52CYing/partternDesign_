package com.qiweichao.design.principle.close_open_prinsiple;

/**
 * Created on 2019/4/17.
 *
 * @author 千秋
 */
public class Test {
    public static void main(String[] args) {
        Operate operate = new OperateAdd(1, 2);
        System.out.println(operate.getResult());
    }
}
