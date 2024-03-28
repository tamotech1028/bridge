package bridge.model;

import bridge.implement.Implementor;

// 軽トラック
public class LightTruck extends Car{

    public LightTruck(Implementor... implementors) {
        super(implementors);
    }

    @Override
    public void drive() {
        System.out.println("軽トラックを運転します");
    }

}
