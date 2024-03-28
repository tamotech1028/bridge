package noBridge;

import noBridge.model.ArmoredCar;
import noBridge.model.Car;
import noBridge.model.DunpTruck;
import noBridge.model.HeavyCar;
import noBridge.model.LightCar;
import noBridge.model.LightTruck;
import noBridge.model.OrdinaryCar;
import noBridge.model.Truck;

public class Main {
    public static void main(String[] args) {

        // 普通車
        Car ordinaryCar = new OrdinaryCar();
        ordinaryCar.drive();

        // 軽自動車
        Car lightCar = new LightCar();
        lightCar.drive();

        // 装甲車
        HeavyCar armoredCar = new ArmoredCar();
        armoredCar.drive();
        armoredCar.upEngineOutput();

        // 軽トラック
        Truck lightTruck = new LightTruck();
        lightTruck.drive();
        lightTruck.upEngineOutput(); // 何もしないのにメソッドは呼べる
        lightTruck.upCarrier();

        // ダンプカー
        Truck dunpTruck = new DunpTruck();
        dunpTruck.drive();
        dunpTruck.upEngineOutput();
        dunpTruck.upCarrier();
    }
}