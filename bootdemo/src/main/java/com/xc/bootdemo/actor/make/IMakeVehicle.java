package com.xc.bootdemo.actor.make;

public interface IMakeVehicle {

    /**
     * 声明一个制造车辆的接口
     * @param vehicleType 车辆类型
     * @param number 需要的数量
     * @return 制造结果
     */
    String makeVehicleByType(String vehicleType,Integer number);

}
