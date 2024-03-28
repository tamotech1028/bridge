package noBridge.model;

// ダンプカー
public class DunpTruck extends Truck {

    @Override
    public void drive() {
        System.out.println("ダンプカーを運転します");
    }

    @Override
    public void upEngineOutput() {
        System.out.println("エンジンの出力を上げます");
    }

    @Override
    public void upCarrier() {
        System.out.println("荷台を上げます");
    }
    
}
