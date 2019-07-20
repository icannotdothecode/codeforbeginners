public class learningtouseintegers {
	
	public static void main(String[] args){
		int a = Integer.parseint(args[1]);
		int b = Integer.parseint(args[2]);
		int sum = a + b;
		int mult = a * b;
		int div = a / b;
		int rem = a % b;
		
		System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + mult);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " = " + quot + " * " + b + " + " + rem);
		
	}
	
}