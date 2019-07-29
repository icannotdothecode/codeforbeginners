///testing if three integers are equal
public class testingequality {
    public static void main(String[] args){
        if (args.length == 0) {
            throw new IllegalArgumentException("Numbers are required! eg: java testingequality.java 1 2 3");
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        if (x == y && x == z){
            System.out.println("All integers are equal.");
        }
        else {
            System.out.println("All integers are not equal.");
        }
    }
}
