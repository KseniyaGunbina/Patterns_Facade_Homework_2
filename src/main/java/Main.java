public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println("10 (1010(2)) * 5 (101(2)) = " + binOps.mult("1010", "101") + "\n" +
                "10 (1010(2)) + 5 (101(2)) = " + binOps.sum("1010", "101"));
    }
}
