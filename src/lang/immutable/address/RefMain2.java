package lang.immutable.address;

import lang.immutable.address.ImmutableAddress;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법이 없다.

        System.out.println("a = " + a); // 서울
        System.out.println("b = " + b); // 서울

//        b.setValue("부산");
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 부산
        System.out.println("b = " + b); // 부산
    }
}
