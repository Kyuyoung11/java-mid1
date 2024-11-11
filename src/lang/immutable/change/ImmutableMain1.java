package lang.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        // obj1.add(20); 이렇게만 쓰면 그냥 반환값을 버리는거임

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
