package com.qiweichao.design.principle.dependenceinversion;

/**
 * Created on 2019/4/23.
 *
 * @author 千秋
 */
public class CycleVehicle implements Vehicle {
    @Override
    public String getName() {
        return "自行车";
    }
}
