///testing if three integers are equal
public class aretheyequal {
    public static void main(String[] args){
        if (args.length == 0) {
            throw new IllegalArgumentException("Numbers are required! eg: java L00ps.java 1 2")
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

    }
}
