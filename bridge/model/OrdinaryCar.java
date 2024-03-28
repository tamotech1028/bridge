package bridge.model;

// 普通車
public class OrdinaryCar extends Car {

    @Override
    public void drive() {
        System.out.println("普通車を運転します");
    }
}
