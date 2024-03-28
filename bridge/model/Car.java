package bridge.model;

import bridge.implement.Implementor;

// 自動車の抽象クラス
abstract public class Car {

    // 機能クラスをフィールドで持つ
    private Implementor[] implementors;

    public Car(Implementor... implementors) {
        this.implementors = implementors;
    }

    // 運転することは全ての自動車に共通の仕様
    public abstract void drive();

    // 車種ごとの特徴を実行するメソッド
    public void applyFeatures() {
        if (this.implementors.length != 0) {
            for (Implementor implementor : this.implementors) {
                implementor.applyFeature();
            }
        }
    }
}
