package com.qiweichao.design.principle.dependenceinversion;

/**
 * Created on 2019/4/23.
 *
 * @author 千秋
 */
public class Person {
    public void goSchool(Vehicle vehicle) {
        System.out.println("用" + vehicle.getName() + "去学校");
    }
}
