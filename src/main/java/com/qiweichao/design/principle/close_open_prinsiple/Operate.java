package com.qiweichao.design.principle.close_open_prinsiple;

public abstract class Operate {
    protected double operateNum1;
    protected double operateNum2;

    public Operate(double operateNum1, double operateNum2) {
        this.operateNum1 = operateNum1;
        this.operateNum2 = operateNum2;
    }

    public abstract double getResult();
}
