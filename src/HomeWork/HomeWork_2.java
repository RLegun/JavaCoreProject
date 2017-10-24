package HomeWork;

import java.util.Scanner;

import static java.lang.Math.*;

public class HomeWork_2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double sinus, cosine, x, e, a, c, t, g, result, result2, result3;

        System.out.print("Please enter sinus :");
        sinus = input.nextDouble();
        System.out.print("Please enter cosinus");
        cosine = input.nextInt();
        System.out.print("Please enter X");
        x = input.nextInt();
        System.out.print("Please enter E");
        e = input.nextInt();
        System.out.print("Please enter A");
        a = input.nextInt();
        System.out.print("Please enter C");
        c = input.nextInt();
        System.out.print("Please enter T");
        t = input.nextInt();
        System.out.print("Please enter G");
        g = input.nextInt();

        result = sqrt((pow(e,2))*a+4.5)/(c*t*g*(x/ PI*2));

        result2 = ((2* pow(sin(sinus),2)*x)/ PI*x)+(pow(x,4)/ cos(cosine)*x);

        result3 = log(5)* abs(x+13* pow(x,2))+ abs(15*x-20)/ pow(x,4);

        System.out.println("result = "+result);
        System.out.println("result2 = "+result2);
        System.out.println("result3 = "+result3);
    }
}
