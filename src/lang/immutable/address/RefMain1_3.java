package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a); // 서울
        System.out.println("b = " + b); // 서울

        change(b, "부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 부산
        System.out.println("b = " + b); // 부산
    }

    private static void change(Address address, String changeValue) {
        address.setValue(changeValue);
    }
}
