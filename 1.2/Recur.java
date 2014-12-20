package rekur;
import java.util.Scanner;
public class Recur {

	public static double recur(double a)
	{
		double r;
		if ( a == 1)
            return 1;
	if (a<0) throw new IllegalArgumentException("x должен быть >=0"); // обработка исключительной ситуации
		r = recur(a-1)*a;
		return r;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		double d = s.nextDouble();
		s.close();
        System.out.println(recur(d));

	}

}
