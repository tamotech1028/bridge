package bridge.model;

// 軽自動車
public class LightCar extends Car {

    @Override
    public void drive() {
        System.out.println("軽自動車を運転します");
    }
}
