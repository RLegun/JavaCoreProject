package Lesson03;
import java.util.Scanner;
/*
Дано дійсні числа x,y.
Якщо х і у додатні піднести їх до квадрату.
Якщо числа від’ємні взяти модуль від них.
Вивести x, якщо він більший за y, і два числа,якщо це не так.
 */

/*


Дано три дійсних числа. Вибрати ті із них, які належать інтервалу (1,3). Ті, що не належать до даного інтервалу зменшити в 10 разів. Вивести отриманий результат



Дано три дійсних числа. Піднести до квадрату ті із них які не від’ємні. Вивести найбільше із отриманих значень.
*/


/*
A B && ||
1 0 0   1
0 1 0   1
1 1 1   1


 */
public class Lesson_3_2 {
    public static void main(String[] args) {
        Scanner inpunt = new Scanner(System.in);

        int x,y;

        System.out.print("введыть X: ");
        x=inpunt.nextInt();
        System.out.print("введыть Y: ");
        y=inpunt.nextInt();

        if((x>0)&&(y>0)){
            x= (int) Math.pow(x,2);
        }


        if(x<0){
            x= Math.abs(x);

        }
        if(y<0){
            y= Math.abs(y);
        }
        if(x>y){
            System.out.println("Х= "+x);

        }else {
            System.out.println(x+" "+y);
        }

    }
}
