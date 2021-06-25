package com.xc.bootdemo.actor.vehicle;

public abstract class AbstractMake implements Make {

    @Override
    public String makeVehicleDoing(Integer number) {
        StringBuffer vehicle = new StringBuffer();
        vehicle.append(getDynamicSystem());
        vehicle.append(getAppearance());
        vehicle.append(getWheelNumber(number));
        return vehicle.toString();
    }

    /**
     * 获取动力系统
     * @return 返回当前订单车辆的动力系统
     */
    protected abstract String getDynamicSystem();

    /**
     * 获取车辆外观
     * @return 返回当前订单车辆的外观
     */
    protected abstract String getAppearance();

    /**
     * 获取车轮数量
     * @param carNumber 车辆数量
     * @return 返回当前订单的车轮数量
     */
    protected abstract Integer getWheelNumber(Integer carNumber);

}
