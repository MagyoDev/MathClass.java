package mathclass;

import java.util.Scanner;


public class MathClass {

    public static void main(String[] args) {
       
        //double x = 3.14;
        //double y = -10;
        
        //double z = Math.max(x, y); 3.14
        //double z = Math.min(x, y); -10
        //double z = Math.abs(y); 10
        //double z = Math.sqrt(x); 1.772004514666935
        //double z = Math.round(x); 3.0
        //double z = Math.ceil(x); 4.0
        //double z = Math.floor(x); 3.0
        
        //System.out.println(z);;
        
        //Hypotenuse
        /*double a;
        double b;
        double c;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com o valor de a: ");
        a = scanner.nextDouble();
        System.out.println("Entre com o valor de b: ");
        b = scanner.nextDouble();
        
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("A Hipotenusa é: "+c);
        
        scanner.close();*/
        
        //Bhaskara
        double a,b,c;
        double delta, x1, x2;
        
        Scanner bhaskara = new Scanner(System.in);
        
        System.out.println("Entre com o valor de a: ");
        a = bhaskara.nextDouble();
        System.out.println("Entre com o valor de b: ");
        b = bhaskara.nextDouble();
        System.out.println("Entre com o valor de c: ");
        c = bhaskara.nextDouble();
        
        delta = (b * b) + (-4 * (a * c));
        
         System.out.println("Delta: "+delta);  
         
          if (delta >= 0) {
 
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
 
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
 
        } else {
            System.out.println("Delta não possui raiz!");
            System.exit(0);
        }
        
    }
    
}
