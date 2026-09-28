package DailyAssignment;

public class Day3 {
	public static void main(String[] args) {
		 //Arthematic operators
        int a=20, b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);
        //increment operator Decrememt operator
        a=20;
        b=10;
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(a);
        System.out.println(b);

        int x=a++ + ++b;
        int y=++a + b++;
        System.out.println(x);
        System.out.println(y);

        a=2;
        b=4;
        x=a-- + --b;
        y=--a + b--;
        System.out.println(x);
        System.out.println(y);

        //comp operator
        a=10;
        b=40;
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        
        //Arithmetic operator
        
        System.out.println(a+a);
        System.out.println(a += 5);
        System.out.println(a -= 5);
        System.out.println(a *= 5);
        System.out.println(a /= 5);
        System.out.println(a %= 5);
        
        //logical operator
        
        int age = 20;
        double gpa = 3.8;
        boolean hasSuspension = false;
        boolean hasMembership = true;
        System.out.println("--- Student Premium Discount Eligibility --- \n");
        if (age >= 18 && age <= 25 && gpa >= 3.5) {
            System.out.println("AND (&&) Result: Eligible for the Academic Honor Discount.");
        } else {
            System.out.println("AND (&&) Result: Not eligible for the Academic Honor Discount.");
        }

        
        if (gpa >= 3.9 || hasMembership) {
            System.out.println("OR (||) Result: Special access granted via loyalty or perfect GPA.");
        } else {
            System.out.println("OR (||) Result: No special access granted.");
        }
        if (!hasSuspension) {
            System.out.println("NOT (!) Result: Account is in good standing. Verification passed.");
        } else {
            System.out.println("NOT (!) Result: Account flagged! Disciplinary suspension active.");
        }
        
       //ternary operator. 
        int num1 = 15;
        int num2 = 25;
        
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The larger number between " + num1 + " and " + num2 + " is: " + max);
        int checkNum = 42;
        String result = (checkNum % 2 == 0) ? "Even" : "Odd";
        System.out.println(checkNum + " is an " + result + " number.");
        int examScore = 72;
        String status = (examScore >= 50) ? "Passed" : "Failed";
        System.out.println("With a score of " + examScore + ", the student has " + status + ".");

        
        
	}

}
