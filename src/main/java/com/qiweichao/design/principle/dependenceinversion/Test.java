package com.qiweichao.design.principle.dependenceinversion;

import javax.crypto.Cipher;

/**
 * Created on 2019/4/23.
 *
 * @author 千秋
 */
public class Test {
    public static void main(String[] args) {
        new Person().goSchool(new CarVehicle());
    }
}
