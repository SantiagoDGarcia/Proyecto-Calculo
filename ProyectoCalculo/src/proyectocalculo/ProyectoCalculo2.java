package proyectocalculo;
import java.util.Scanner;

/**
 * f(x)=10x^2-x+2
 * f(x)=7x^2-5x+15
 * f(x)=3x^2-√3
 * //   \    >   =  < (Simbolos necesarios....IGNORAR)
 * @author Sant Garcia
 */
public class ProyectoCalculo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        
        int  opcion;
        double x, x2, y, y2; 
        
        System.out.println(" _________________________________________________________________________" + "\n" +
                           "|                                                                         | " + "\n" +
                           "|                          PROYECTO DE CÁLCULO                            | " + "\n" +
                           "|_________________________________________________________________________| " + "\n" +
                           "| Hola usuario, este es un proyecto de programacion básica, el cual te    | " + "\n" +
                           "| permitirá encontrar los valores de la funcion F(x), solamente de forma  | " + "\n" +
                           "| analítica de algunas funciones ya preleccionadas...                     | " + "\n" +
                           "|                                                                         | " + "\n" +
                           "| Funciones a expresar:                                                   | " + "\n" +
                           "| 1) f(x)=10x^2-x+2                                                       | " + "\n" +
                           "| 2) f(x)=7x^2-5x+15                                                      | " + "\n" +
                           "| 3) f(x)=3x^2-√3                                                         | " + "\n" +
                           "| 4) f(x)                                                                 | " + "\n" +
                           "| 5)                                                                      | " + "\n" +
                           "| 6)                                                                      | " + "\n" +
                           "| 7)                                                                      | " + "\n" +
                           "| 8)                                                                      | " + "\n" +
                           "| 9)                                                                      | " + "\n" +
                           "| 10)f(x)                                                                 | " + "\n" +
                           "|                                                                         | " + "\n" +
                           "| Te pedimos completes los datos requeridos:                              | " + "\n" +
                           "|_________________________________________________________________________| ");
        System.out.print  ("| Ingrese el número de la funcion que desea realizar (1-10): "); opcion = entrada.nextInt();
        System.out.print  ("| Ingrese el valor intermedio de X: "); x = entrada.nextDouble();
        System.out.println("|_________________________________________________________________________");
        
        x2 = x-1;
        
        // Se verifica la opción acerca de la funcion escogida por el usuario
        switch(opcion){
            case 1:
                System.out.println(" Función: f(x)=10x^2-x+2");
                System.out.println(" __________________________" + "\n" +
                                   "|   Valor X  |  Valor f(X) |" + "\n" +
                                   "|__________________________|" + "\n"+
                                   "|      Mayores que X       |" +"\n"+
                                   "|__________________________|");

                // Determinacion de valores en un rango 
                // 10 número Igual y Mayores que X
                for (int i = 0; i <10 ; i++) {
                    y = 10*(x*x)-(x)+2;
                    System.out.println("|     "+x+" "+"       "+y);
                    x = x+1;
                }
                System.out.println("|__________________________ " +"\n"+
                                   "|       Menores que X      |" +"\n"+
                                   "|__________________________|");
                // 10 números Menores que X
                for (int i = 0; i < 10; i++) {
                    y = 10*(x2*x2)-(x2)+2;
                    System.out.println("|    "+x2+" "+"       "+y);
                    x2 = x2-1;
                }break;
                
            case 2:
                System.out.println(" Función: f(x)=7x^2-5x+15");
                System.out.println(" __________________________" + "\n" +
                                   "|   Valor X  |  Valor f(X) |" + "\n" +
                                   "|__________________________|" + "\n"+
                                   "|      Mayores que X       |" +"\n"+
                                   "|__________________________|");
                // Determinacion de valores en un rango 
                // 10 número Igual y Mayores que X
                for (int i = 0; i <10 ; i++) {
                    y = 7*(x*x)-5*(x)+15;
                    System.out.println("|     "+x+" "+"       "+y);
                    x = x+1;
                }
                System.out.println("|__________________________ " +"\n"+
                                   "|       Menores que X      |" +"\n"+
                                   "|__________________________|");
                // 10 números Menores que X
                for (int i = 0; i < 10; i++) {
                    y = 7*(x2*x2)-5*(x2)+15;
                    System.out.println("|    "+x2+" "+"       "+y);
                    x2 = x2-1;
                }break;
                
            case 3:
                System.out.println(" Función: f(x)=3x^2-√3");
                System.out.println(" __________________________" + "\n" +
                                   "|   Valor X  |  Valor f(X) |" + "\n" +
                                   "|__________________________|" + "\n"+
                                   "|      Mayores que X       |" +"\n"+
                                   "|__________________________|");
                // Determinacion de valores en un rango 
                // 10 número Igual y Mayores que X
                for (int i = 0; i <10 ; i++) {
                    y = 3*(x*x)-Math.sqrt(3);
                    System.out.println("|     "+x+" "+"       "+y);
                    x = x+1;
                }
                System.out.println("|__________________________ " +"\n"+
                                   "|       Menores que X      |" +"\n"+
                                   "|__________________________|");
                // 10 números Menores que X
                for (int i = 0; i < 10; i++) {
                    y = 3*(x2*x2)-Math.sqrt(3);
                    System.out.println("|    "+x2+" "+"       "+y);
                    x2 = x2-1;
                }break;
                
            case 4:
                
                
                break;
                
            case 5:
                
                
                break;
            
            case 6:
                
                
                break;
                
            case 7:
                
                
                break;
            
            default:
                System.out.println("| El número de función que ingresaste no pertenece a ninguno              |"+ "\n" +
                        "| de los expresados anteriormente, por favor ingresa un número            |"+ "\n" +
                        "|                            _____________________________________________|" + "\n" +
                        "|    Del 1   |  Hasta el 10 |");
                
        }
                System.out.println("|____________|______________|");
        System.out.println(" ____________________________________________________________________" + "\n" +
                           "| Gracias...                                                         |"+ "\n" +
                           "| Creditos: Aguirre Alex, Flores Jorge, García Santiago, Leiva Diego |"+ "\n" +
                           "|____________________________________________________________________|");
        
        
    }
    
}
