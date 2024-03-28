package bridge;

import bridge.implement.UpCarrierImpl;
import bridge.implement.UpEngineOutputImpl;
import bridge.model.ArmoredCar;
import bridge.model.Car;
import bridge.model.DunpTruck;
import bridge.model.LightCar;
import bridge.model.LightTruck;
import bridge.model.OrdinaryCar;

public class Main {
    public static void main(String[] args) {

        // 軽自動車
        Car lightCar = new LightCar();
        lightCar.drive();
        lightCar.applyFeatures();

        // 普通車
        Car ordinaryCar = new OrdinaryCar();
        ordinaryCar.drive();
        ordinaryCar.applyFeatures();

        // 装甲車
        Car armoredCar = new ArmoredCar(new UpEngineOutputImpl());
        armoredCar.drive();
        armoredCar.applyFeatures();

        // 軽トラック
        Car lightTruck = new LightTruck(new UpCarrierImpl());
        lightTruck.drive();
        lightTruck.applyFeatures();
        
        // ダンプカー
        Car dunpTruck = new DunpTruck(new UpEngineOutputImpl(), new UpCarrierImpl());
        dunpTruck.drive();
        dunpTruck.applyFeatures();
    }
}
