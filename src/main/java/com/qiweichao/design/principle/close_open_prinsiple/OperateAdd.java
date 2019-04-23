package com.qiweichao.design.principle.close_open_prinsiple;

/**
 * Created on 2019/4/23.
 *
 * @author 千秋
 */
public class OperateAdd extends Operate {
    public OperateAdd(double operateNum1, double operateNum2) {
        super(operateNum1, operateNum2);
    }

    public double getResult() {
        return operateNum1 + operateNum2;
    }
}
