package DailyAssignment;

public class Day2 {

	public static void main(String[] args) {
		
		   byte a= -128; 
	        byte b = 127;
	       // byte c = 128;
	        short c = -32768;
	        short d = 32767;
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	        System.out.println(d);

	        //int
	        int e = -2147483648;
	        int f = 2147483647;
	        System.out.println(e);
	        System.out.println(f);

	        //long
	        long g = -9223372036854775808L;//integer number too large
	        long h = 9223372036854775807l;
	        System.out.println(g);
	        System.out.println(h);
//	        note :-->if value crossing int range then l is man
	        // if not values is not crossing int range l is opn
	        long j = 134645;
	        System.out.println(j);
	       // num :-->int

	        byte emg = 100;
	        short year = 2006;
	        int pin_code = 560060;
	        long ph = 9234567899L;
	        System.out.println(emg);
	        System.out.println(year);
	        System.out.println(pin_code);
	        System.out.println(ph);

	        //decimal
	        float i = 45.26F; //incompatible types: possible lossy conversion from double to float
	        double k = 45896325.23;
	        System.out.println(i);
	        System.out.println(k);

	        // char
	        char l = 'a';
	        char o = '1';
	        char p = ' ';
	        System.out.println(l);
	        System.out.println(o);
	        System.out.println(p);

	        //boolean
	        boolean is_java = true;
	        boolean is_python = false;
	        System.out.println(is_java);
	        System.out.println(is_python);

	        //collection of char
	        String s = "Hello i am java";
	        String r = "true";
	        String w = "1243";
	        System.out.println(s);
	        System.out.println(r);
	        System.out.println(w);


	}

}
