package noBridge.model;

// 装甲車
public class ArmoredCar extends HeavyCar {

    @Override
    public void drive() {
        System.out.println("装甲車を運転します");
    }

    @Override
    public void upEngineOutput() {
        System.out.println("エンジンの出力を上げます");
    }
}
