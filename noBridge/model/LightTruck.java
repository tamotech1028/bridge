package noBridge.model;

// 軽トラック
public class LightTruck extends Truck {

    @Override
    public void drive() {
        System.out.println("軽トラックを運転します");
    }

    @Override
    public void upEngineOutput() {
        // 軽トラックにはエンジンの出力を常時上げる必要はないため何もしない
    }

    @Override
    public void upCarrier() {
        System.out.println("荷台を上げます");
    }
}
