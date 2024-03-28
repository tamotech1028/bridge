package bridge.model;

import bridge.implement.Implementor;

// 装甲車
public class ArmoredCar extends Car {

    public ArmoredCar(Implementor... implementors) {
        super(implementors);
    }

    @Override
    public void drive() {
        System.out.println("装甲車を運転します");
    }
}
