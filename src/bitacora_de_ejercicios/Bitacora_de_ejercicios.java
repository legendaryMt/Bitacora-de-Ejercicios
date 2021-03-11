
package bitacora_de_ejercicios;
import java.util.Scanner;
public class Bitacora_de_ejercicios {

    public static void main(String[] args) {
       Scanner t=new Scanner (System.in);
       int opc;
       boolean salir=false;
       boolean salir2=false;
       do{
           System.out.println("");
       System.out.println("Menu de opciones");
       System.out.println("1.e^X");
       System.out.println("2.e^-X");
       System.out.println("3.tres métodos para resolver la ecuación cuadrática.");
       System.out.println("4.Varianza");
       System.out.println("5.Salir");
       System.out.println("Ingrese la opcion a elegir");
       opc=t.nextInt();
       int base, exponente;
       switch (opc){
           case 1:

  
        System.out.println("Ingrese el valor de la base");
        base=t.nextInt();
        System.out.println("Ingrese el valor del exponente");
        exponente=t.nextInt();
        double suma=0;
    for(int i=0;i<exponente+1;i++){
        suma=suma+Math.pow(base,i)/(fac(i));
    }
    System.out.print("El resultado es:"+suma);
               break;
           case 2:
        System.out.println("Ingrese el valor de la base");
        base=t.nextInt();
        System.out.println("Ingrese el valor del exponente");
        exponente=t.nextInt();
        double suma2=0;
    for(int i=0;i<exponente+1;i++){
        suma2=suma2+1/(Math.pow(base,i)/(fac(i)));
    }
    System.out.print("El resultado es:"+suma2);
           break;

           case 3: 
       
               do{
                       double a = 0, b = 0, c = 0;
    
    double x1, x2;
    int n = 0;
    System.out.println("Resolver ecuacion cuadratica;");
    System.out.println("1. Por formula General");
    System.out.println("2.Por racionalizar un numerador");
    System.out.println("3.A la inversa");
    System.out.println("4.Salir");
    
    System.out.println("Ingrese el metodo a elegir;");
    n=t.nextInt();
switch (n){
    case 1:
        System.out.println("Ingrese el valor de: A");
        a=t.nextDouble();
        System.out.println("Ingrese el valor de: B");
        b=t.nextDouble();
        System.out.println("Ingrese el valor de: C");
        c=t.nextDouble();
        double numero= (b*b)-(4*a*c);
        if(numero>0){
         x1=(-b+Math.sqrt(numero))/(2*a);
         x2=(-b-Math.sqrt(numero))/(2*a);
         System.out.println("La ecuación tiene dos soluciones");
         System.out.println("X1;"+x1);
         System.out.println("X2;"+x2);
        }else{
            if(numero==0){
                 x1=(-b+Math.sqrt(numero))/(2*a);
                 System.out.println("La ecuación tiene una solución");
                 System.out.println("X1;"+x1);
            }else{
                System.out.println("La ecuación no tiene solución");
            }
        }break;
    case 2:
         double numero1= (b*b)-(4*a*c);
         
        System.out.println("Ingrese el valor de: A");
        a=t.nextDouble();
        System.out.println("Ingrese el valor de: B");
        b=t.nextDouble();
        System.out.println("Ingrese el valor de: C");
        c=t.nextDouble();
        if(numero1>0){
         x1=((-2)*(c))/(b+Math.sqrt(numero1));
         x2=((-2)*(c))/(b-Math.sqrt(numero1));
         System.out.println("La ecuación tiene dos soluciones");
         System.out.println("X1;"+x1);
         System.out.println("X2;"+x2);
        }else{
            if(numero1==0){
                 x1=((-2)*(c))/(b+Math.sqrt(numero1));
                 System.out.println("La ecuación tiene una solución");
                 System.out.println("X1;"+x1);
            }else{
                System.out.println("La ecuación no tiene solución");
            }

         
    }break;
    case 3:
        double numero2= Math.pow(b,2)-(4*a*c);
        System.out.println("Ingrese el valor de: A");
        a=t.nextDouble();
        System.out.println("Ingrese el valor de: B");
        b=t.nextDouble();
        System.out.println("Ingrese el valor de: C");
        c=t.nextDouble();
                if(numero2>0){
         x1=(-2*c)/(b+(Math.sqrt(Math.pow(b,2)-(4*a*c))));
         x2=(-2*c)/(b-(Math.sqrt(Math.pow(b,2)-(4*a*c))));
         System.out.println("La ecuación tiene dos soluciones");
         System.out.println("X1;"+x1);
         System.out.println("X2;"+x2);
        }else{
            if(numero2==0){
                 x1=(-2*c)/(b+(Math.sqrt(Math.pow(b,2)-(4*a*c))));
                 System.out.println("La ecuación tiene una solución");
                 System.out.println("X1;"+x1);
            }else{
                System.out.println("La ecuación no tiene solución");
            }
        
        break;
}
    case 4:
        salir=true;
        break;
 }
 }while(salir==false);
           case 4: 
               double NumAle[];
               double Media=0,Var=0,Med=0,SumVar=0;
               System.out.println("Cálculo de varianza");
               System.out.println("Cantidad de Números que quiere generar aleatoriamente");
               int CanNum=t.nextInt();
               
               NumAle=new double [CanNum];
               for (int i=0;i<CanNum;i++){
                   NumAle[i]=Math.random();
               }
               for (int i=0;i<CanNum;i++){
                   Media+=NumAle[i];
               }
               Med=Media/CanNum;
               for (int i=0;i<CanNum;i++){
                   SumVar+=Math.pow(NumAle[i]-Med, 2);
               }
               Var=SumVar/CanNum;
               System.out.println("La varianza de los "+CanNum+" números aleatorios generados es: " +Var);
               break;
           case 5:
               salir2=true;
               break;
    }
       }while(salir2=true);
    }
    public static double fac(int num){
        double fac;
    if(num==0)
        return 1;
    else
        return num*fac(num-1);
    }
    
}
