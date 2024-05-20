package generic;

public class GenericPrinter<T extends Meterial> {
    /* 두 개의 재료로 쓰는 프린터를 만든다고 했을 때
     * 재료가 Powder가 있을 수도 있고, Platic도 있을 수가 있는데
     * 재료를 material이라고 했을 때 이거의 타입을 뭘로 할 거냐
     * 이제 둘 다일 수도 있다라는 것이다. 이외에도 뭐 또 있을 수가 있고 그러니까 이거를 좀 더
     * 일반적으로 이제 T 실제로 이 애를 가져다 쓸 때 이 프린터를 쓸 때 재료를 정하자라는 의미다.
     * 그래서 T 이렇게 하면 이 T타입에 이제 적용이 돼서 이 클래스가 나중에 실제로 생성될 때
     * 모두 대입이 될 것이다. 어떤 재료가 되는지
     */

    // T extends Meterial 이건 Meterial에서 상속받은 애들만 GenericPrinter의 재료로 쓸 수가 있다.

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }
    public void printing() {
        material.doPrinting();
    }
}
