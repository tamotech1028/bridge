package bridge.implement;

// エンジンの出力を上げる
public class UpEngineOutputImpl implements Implementor {

    @Override
    public void applyFeature() {
        System.out.println("エンジンの出力を上げます");
    }
}
