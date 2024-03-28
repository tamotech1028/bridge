package bridge.model;

import bridge.implement.Implementor;

// ダンプカー
public class DunpTruck extends Car {

    public DunpTruck(Implementor... implementors) {
        super(implementors);
    }

    @Override
    public void drive() {
        System.out.println("ダンプカーを運転します");
    }
}
