
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Integer value: " + intBox.getValue());

        Box<String> strBox = new Box<>();
        strBox.setValue("Hello, World!");
        System.out.println("String value: " + strBox.getValue());
    }
}
