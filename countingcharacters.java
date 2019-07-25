import java.util.Scanner;
public class countingcharacters {
    public static void main(String[] args) {
        if (args.length == 0) {
			throw new IllegalArgumentException("String is required! (eg: java countingcharacters.java Vishal Singh)");
		}
		for (String test : args) {
            System.out.println("Note to user: Each space starts a new word/instance.")
            count(test);
        }
	}


    public static void count(String x){
        String storedstring = x;
		char[] ch = x.toCharArray();
		int letter = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else{
				other ++;
			}
		}

		System.out.println("\nThe string is : " + storedstring);
		System.out.println("letter: " + letter);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
	}
}
