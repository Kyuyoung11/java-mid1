package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //결과가 같게 나옴 - java.lang.Object@10f87f48
        System.out.println(string);
        System.out.println(object);
    }
}
