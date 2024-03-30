import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {

        Arithmetic arithmetic = new Arithmetic<>(8.89, 8);
        System.out.println(arithmetic.add());
        System.out.println(arithmetic.subtract());
        System.out.println(arithmetic.multiply());
        System.out.println(arithmetic.getMax());
        System.out.println(arithmetic.getMin());

        MyMap<String, Integer> mymap = new MyMap<>();
        mymap.put("k1", 1);
        mymap.put("k2", 2);

        System.out.println("[INITIAL] k1 = " + mymap.get("k1"));
        System.out.println("[INITIAL] k2 = " + mymap.get("k2"));

        mymap.put("k1", 10);
        mymap.put("k2", 20);

        System.out.println("[GET AFTER UPDATE] k1 = " + mymap.get("k1"));
        System.out.println("[GET AFTER UPDATE] k2 = " + mymap.get("k2"));

        System.out.println("[REMOVE] k1 = " + mymap.remove("k1"));
        System.out.println("[GET AFTER UPDATE] k1 = " + mymap.get("k1"));

    }
}