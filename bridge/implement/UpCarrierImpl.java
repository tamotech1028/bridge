package bridge.implement;

// 荷台を上げる
public class UpCarrierImpl implements Implementor {

    @Override
    public void applyFeature() {
        System.out.println("荷台を上げます");
    }
}