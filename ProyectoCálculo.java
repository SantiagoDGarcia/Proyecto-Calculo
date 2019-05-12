package proyecto.calculo;

import java.util.Scanner;

/**
 * f(x)=10x^2-x+2 f(x)=7x^2-5x+15 f(x)=3x^2-√3 // \ > = < (Simbolos
 * necesarios....IGNORAR) @author Sant Garcia
 */
public class ProyectoCalculoFinal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        double x, x2, y, y2;

        System.out.println(" __________________________________________________"
                + "_______________________" + "\n"
                + "|                                                           "
                + "              | " + "\n"
                + "|                          PROYECTO DE C�?LCULO              "
                + "              | " + "\n"
                + "|___________________________________________________________"
                + "______________| " + "\n"
                + "| Hola usuario, este es un proyecto de programacion básica, "
                + "el cual te    | " + "\n"
                + "| permitirá encontrar los valores de la funcion F(x), solame"
                + "nte de forma  | " + "\n"
                + "| analítica de algunas funciones ya preleccionadas.         "
                + "              | " + "\n"
                + "|                                                           "
                + "              | " + "\n"
                + "| Funciones a expresar:                                     "
                + "              | " + "\n"
                + "| 1) f(x)=10x^2-x+2                                         "
                + "              | " + "\n"
                + "| 2) f(x)=7x^2-5x+15                                        "
                + "              | " + "\n"
                + "| 3) f(x)=3x^2-√3                                           "
                + "              | " + "\n"
                + "| 4) f(x)=(x^2+2)/(-8x+3)                                   "
                + "              | " + "\n"
                + "| 5) f(x)=7/2 x^3+〖8x〗^2-3x+2                              "
                + "              | " + "\n"
                + "| 6) f(x)=(x^2-5)/2x                                        "
                + "              | " + "\n"
                + "| 7) f(x)=4x^3-8x+1                                         "
                + "              | " + "\n"
                + "| 8) f(x)=15x^3+2x^2+1                                      "
                + "              | " + "\n"
                + "| 9) f(x)=3x^2+2x+5                                         "
                + "              | " + "\n"
                + "| 10) f(x)=2x^2-x+10                                        "
                + "              | " + "\n"             
                + "|___________________________________________________________"
                + "______________| ");
        System.out.print("Ingrese el número de la funcion que desea realizar "
                + "(1-10): ");
        opcion = entrada.nextInt();
        System.out.print("Ingrese el valor intermedio de X: ");
        x = entrada.nextDouble();
        System.out.println("|__________________________________________________"
                + "_______________________");

        x2 = x - 1;

        // Se verifica la opción acerca de la funcion escogida por el usuario
        switch (opcion) {
            case 1:
                System.out.println(" Función: f(x)=10x^2-x+2");
                System.out.println(" __________________________" + "\n"
                        + "|   Valor X  |  Valor f(X) |" + "\n"
                        + "|__________________________|" + "\n"
                        + "|      Mayores que X       |" + "\n"
                        + "|__________________________|");

                // Determinacion de valores en un rango 
                // 10 número Igual y Mayores que X
                for (int i = 0; i < 10; i++) {
                    y = 10 * (x * x) - (x) + 2;
                    System.out.println("|     " + x + " " + "       " + y);
                    x = x + 1;
                }
                System.out.println("|__________________________ " + "\n"
                        + "|       Menores que X      |" + "\n"
                        + "|__________________________|");
                // 10 números Menores que X
                for (int i = 0; i < 10; i++) {
                    y = 10 * (x2 * x2) - (x2) + 2;
                    System.out.println("|    " + x2 + " " + "       " + y);
                    x2 = x2 - 1;
                }
                break;

            case 2:
                System.out.println(" Función: f(x)=7x^2-5x+15");
                System.out.println(" __________________________" + "\n"
                        + "|   Valor X  |  Valor f(X) |" + "\n"
                        + "|__________________________|" + "\n"
                        + "|      Mayores que X       |" + "\n"
                        + "|__________________________|");
                // Determinacion de valores en un rango 
                // 10 número Igual y Mayores que X
                for (int i = 0; i < 10; i++) {
                    y = 7 * (x * x) - 5 * (x) + 15;
                    System.out.println("|     " + x + " " + "       " + y);
                    x = x + 1;
                }
                System.out.println("|__________________________ " + "\n"
                        + "|       Menores que X      |" + "\n"
                        + "|__________________________|");
                // 10 números Menores que X
                for (int i = 0; i < 10; i++) {
                    y = 7 * (x2 * x2) - 5 * (x2) + 15;
                    System.out.println("|    " + x2 + " " + "       " + y);
                    x2 = x2 - 1;
                }
                break;

            case 3:
                System.out.println(" Función: f(x)=3x^2-√3");
                System.out.println(" __________________________" + "\n"
                        + "|   Valor X  |  Valor f(X) |" + "\n"
                        + "|__________________________|" + "\n"
                        + "|      Mayores que X       |" + "\n"
                        + "|__________________________|");
                // Determinacion de valores en un rango 
                // 10 número Igual y Mayores que X
                for (int i = 0; i < 10; i++) {
                    y = 3 * (x * x) - Math.sqrt(3);
                    System.out.println("|     " + x + " " + "       " + y);
                    x = x + 1;
                }
                System.out.println("|__________________________ " + "\n"
                        + "|       Menores que X      |" + "\n"
                        + "|__________________________|");
                // 10 números Menores que X
                for (int i = 0; i < 10; i++) {
                    y = 3 * (x2 * x2) - Math.sqrt(3);
                    System.out.println("|    " + x2 + " " + "       " + y);
                    x2 = x2 - 1;
                }
                break;

            case 4:
                System.out.println(" Función: f(x)=(x^2+2)/(-8x+3)");
                System.out.println(" __________________________" + "\n"
                        + "|   Valor X  |  Valor f(X) |" + "\n"
                        + "|__________________________|" + "\n"
                        + "|      Mayores que X       |" + "\n"
                        + "|__________________________|");

                // 10 número Igual y Mayores que X
                for (int i = 0; i < 10; i++) {
                    y = ((x * x) + 2) / (-8 * x + 3);
                    System.out.println("|     " + x + " " + "       " + y);
                    x = x + 1;
                }
                System.out.println("|__________________________ " + "\n"
                        + "|       Menores que X      |" + "\n"
                        + "|__________________________|");
                // 10 números Menores que X
                for (int i = 0; i < 10; i++) {
                    y = ((x2 * x2) + 2) / (-8 * x2 + 3);
                    System.out.println("|    " + x2 + " " + "       " + y);
                    x2 = x2 - 1;
                }
                break;

            case 5:
                System.out.println(" Función: f(x)=7/2 x^3+〖8x〗^2-3x+2 ");
                System.out.println(" __________________________" + "\n"
                        + "|   Valor X  |  Valor f(X) |" + "\n"
                        + "|__________________________|" + "\n"
                        + "|      Mayores que X       |" + "\n"
                        + "|__________________________|");

                // Determinacion de valores en un rango 
                // 10 número Igual y Mayores que X
                for (int i = 0; i < 10; i++) {
                    y = ((7/2) * (x * x * x))+(8 * x)*(8 * x)-(3 * x) + 2;
                    System.out.println("|     " + x + " " + "       " + y);
                    x = x + 1;
                }
                System.out.println("|__________________________ " + "\n"
                        + "|       Menores que X      |" + "\n"
                        + "|__________________________|");
                // 10 números Menores que X
                for (int i = 0; i < 10; i++) {
                    y = ((7/2) * (x2 * x2 * x2))+(8 * x2)*(8 * x2)-(3 * x2) + 2;
                    System.out.println("|    " + x2 + " " + "       " + y);
                    x2 = x2 - 1;
                }
                break;

            case 6:
                System.out.println(" FunciÃ³n: f(x)=(x^2-5)/2x");
                System.out.println(" __________________________" + "\n"
                        + "|   Valor X  |  Valor f(X) |" + "\n"
                        + "|__________________________|" + "\n"
                        + "|      Mayores que X       |" + "\n"
                        + "|__________________________|");
                // Determinacion de valores en un rango 
                // 10 nÃºmero Igual y Mayores que X
                for (int i = 0; i < 10; i++) {
                    y = (x * x) - 5 / 2 * x;
                    System.out.println("|     " + x + " " + "       " + y);
                    x = x + 1;
                }
                System.out.println("|__________________________ " + "\n"
                        + "|       Menores que X      |" + "\n"
                        + "|__________________________|");
                // 10 nÃºmeros Menores que X
                for (int i = 0; i < 10; i++) {
                    y = (x2 * x2) - 5 / 2 * x2;
                    System.out.println("|    " + x2 + " " + "       " + y);
                    x2 = x2 - 1;
                }
                break;

            case 7:
                System.out.println(" FunciÃ³n: f(x)=4x^3-8x+1");
                System.out.println(" __________________________" + "\n"
                        + "|   Valor X  |  Valor f(X) |" + "\n"
                        + "|__________________________|" + "\n"
                        + "|      Mayores que X       |" + "\n"
                        + "|__________________________|");
                // Determinacion de valores en un rango 
                // 10 nÃºmero Igual y Mayores que X
                for (int i = 0; i < 10; i++) {
                    y = 3 * (x * x * x) - 8 * x + 1;
                    System.out.println("|     " + x + " " + "       " + y);
                    x = x + 1;
                }
                System.out.println("|__________________________ " + "\n"
                        + "|       Menores que X      |" + "\n"
                        + "|__________________________|");
                // 10 nÃºmeros Menores que X
                for (int i = 0; i < 10; i++) {
                    y = 3 * (x2 * x2 * x2) - 8 * x2 + 1;
                    System.out.println("|    " + x2 + " " + "       " + y);
                    x2 = x2 - 1;
                }
                break;
            case 8:
                System.out.println(" FunciÃ³n: f(x)=15x^3+2x^2+1");
                System.out.println(" __________________________" + "\n"
                        + "|   Valor X  |  Valor f(X) |" + "\n"
                        + "|__________________________|" + "\n"
                        + "|      Mayores que X       |" + "\n"
                        + "|__________________________|");
                // Determinacion de valores en un rango 
                // 10 nÃºmero Igual y Mayores que X
                for (int i = 0; i < 10; i++) {
                    y = 15 * (x * x * x) + 2 * (x * x) + 1;
                    System.out.println("|     " + x + " " + "       " + y);
                    x = x + 1;
                }
                System.out.println("|__________________________ " + "\n"
                        + "|       Menores que X      |" + "\n"
                        + "|__________________________|");
                // 10 nÃºmeros Menores que X
                for (int i = 0; i < 10; i++) {
                    y = 15 * (x2 * x2 * x2) + 2 * (x2 * x2) + 1;
                    System.out.println("|    " + x2 + " " + "       " + y);
                    x2 = x2 - 1;
                }

                break;
            
            case 9:
                
                System.out.println(" FunciÃ³n: f(x)= 3x^2+2x+5");
                System.out.println(" __________________________" + "\n" +
                                   "|   Valor X  |  Valor f(X) |" + "\n" +
                                   "|__________________________|" + "\n"+
                                   "|      Mayores que X       |" +"\n"+
                                   "|__________________________|");
                // Determinacion de valores en un rango 
                // 10 nÃºmero Igual y Mayores que X
                for (int i = 0; i < 10 ; i++) {
                    y = (3*(x*x))+(2*x)+5;
                    System.out.println("|     "+x+" "+"       "+y);
                    x = x+1;
                }
                System.out.println("|__________________________ " +"\n"+
                                   "|       Menores que X      |" +"\n"+
                                   "|__________________________|");
                // 10 nÃºmeros Menores que X
                for (int i = 0; i < 10; i++) {
                    y = (3*(x2 * x2))+(2 * x2)+5;
                    System.out.println("|    "+x2+" "+"       "+y);
                    x2 = x2-1;}
                
                break;
            case 10:
                
                System.out.println(" FunciÃ³n: f(x)= 2x^2-x+10");
                System.out.println(" __________________________" + "\n" +
                                   "|   Valor X  |  Valor f(X) |" + "\n" +
                                   "|__________________________|" + "\n"+
                                   "|      Mayores que X       |" +"\n"+
                                   "|__________________________|");
                // Determinacion de valores en un rango 
                // 10 nÃºmero Igual y Mayores que X
                for (int i = 0; i <10 ; i++) {
                    y = (2 *(x * x))- x + 10;
                    System.out.println("|     "+x+" "+"       "+y);
                    x = x+1;
                }
                System.out.println("|__________________________ " +"\n"+
                                   "|       Menores que X      |" +"\n"+
                                   "|__________________________|");
                // 10 nÃºmeros Menores que X
                for (int i = 0; i < 10; i++) {
                    y = (2 *(x2 * x2))- x2 + 10;
                    System.out.println("|    "+x2+" "+"       "+y);
                    x2 = x2-1;}
                
                break;    
            default:
                System.out.println("| El número de función que ingresaste no "
                        + "pertenece a ninguno              |" + "\n"
                        + "| de los expresados anteriormente, por favor ingresa"
                        + " un número            |" + "\n"
                        + "|                            _______________________"
                        + "______________________|" + "\n"
                        + "|    Del 1   |  Hasta el 10 |");

                System.out.println("|____________|______________|");
                System.out.println(" __________________________________________"
                        + "__________________________" + "\n"
                        + "| Gracias.                                          "
                        + "               |" + "\n"
                        + "| Creditos: Aguirre Alex, Flores Jorge, García "
                        + "Santiago, Leiva Diego |" + "\n"
                        + "|___________________________________________________"
                        + "_________________|");

        }

    }
}
