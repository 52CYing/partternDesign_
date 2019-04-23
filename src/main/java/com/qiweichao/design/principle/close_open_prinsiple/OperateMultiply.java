package com.qiweichao.design.principle.close_open_prinsiple;

/**
 * Created on 2019/4/23.
 *
 * @author 千秋
 */
public class OperateMultiply extends Operate {
    public OperateMultiply(double operateNum1, double operateNum2) {
        super(operateNum1, operateNum2);
    }

    @Override
    public double getResult() {
        return operateNum1 * operateNum2;
    }
}
