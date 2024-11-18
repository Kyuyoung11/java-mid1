package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        System.out.println("result = " + adder.add(1).add(2).add(3).getValue()); // 6
    }
}
