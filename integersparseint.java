public class integersparseint {
	public static void main(String[] args){
		if (args.length == 0) {
			throw new IllegalArgumentException("Numbers are required! Command should be followed by 'a b' to assign numbers. (eg: java integersparseint.java 2 3)");
		}
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
		int sum = a + b;
		int mult = a * b;
		int div = a / b;
		int rem = a % b;

		System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + mult);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " = " + div + " * " + b + " + " + rem);

	}

}
