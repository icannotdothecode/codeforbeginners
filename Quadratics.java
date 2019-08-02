public class Quadratics { 

    public static void main(String[] args) { 
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = b*b - 4.0*c;
        double sroot =  Math.sqrt(discriminant);

        double root1 = (-b + sroot) / 2.0;
        double root2 = (-b - sroot) / 2.0;

        System.out.println(root1);
        System.out.println(root2);
    }
}
