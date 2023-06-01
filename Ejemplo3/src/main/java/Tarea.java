import java.util.Scanner;
import java.util.Random;

public class Tarea {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rd = new Random();
int respuesta, num1, num2, resultado;
int nivel = 0;
int aciertos = 0;

//Menú de nivel de dificultad

System.out.println("Seleccione el nivel de dificultad que desea jugar: ");
System.out.println("1 - Básico (suma )");
System.out.println("2 - Intermedio (resta )");
System.out.println("3 - Avanzado (multiplicación )");
System.out.println("4 - Experto (divisións)");
System.out.println("5 - Aleatorio (suma, resta, multiplicación y división )");
nivel = sc.nextInt();

//Bucle de 10 preguntas
for(int i=1; i<=10; i++) {
switch(nivel) {
case 1:
num1 = rd.nextInt(9) + 1;
num2 = rd.nextInt(9) + 1;
resultado = num1 + num2;
System.out.println("Pregunta " + i + ": ¿Cuánto es " + num1 + " + " + num2 + "?");
respuesta = sc.nextInt();
if(respuesta == resultado) {
System.out.println("Muy bien! Excelente! Buen trabajo! Sigue así!");
aciertos++;
} else {
System.out.println("No. Por favor intenta de nuevo. Incorrecto. Intenta una vez mas. No te rindas. No. Sigue intentando.");
}
break;
case 2:
num1 = rd.nextInt(99) + 1;
num2 = rd.nextInt(num1) + 1;
resultado = num1 - num2;
System.out.println("Pregunta " + i + ": ¿Cuánto es " + num1 + " - " + num2 + "?");
respuesta = sc.nextInt();
if(respuesta == resultado) {
System.out.println("Muy bien! Excelente! Buen trabajo! Sigue así!");
aciertos++;
} else {
System.out.println("No. Por favor intenta de nuevo. Incorrecto. Intenta una vez mas. No te rindas. No. Sigue intentando.");
}
break;
case 3:
num1 = rd.nextInt(90) + 10;
num2 = rd.nextInt(90) + 10;
resultado = num1 * num2;
System.out.println("Pregunta " + i + ": ¿Cuánto es " + num1 + " x " + num2 + "?");
respuesta = sc.nextInt();
if(respuesta == resultado) {
System.out.println("Muy bien! Excelente! Buen trabajo! Sigue así!");
aciertos++;
} else {
System.out.println("No. Por favor intenta de nuevo. Incorrecto. Intenta una vez mas. No te rindas. No. Sigue intentando.");
}
break;
case 4:
num1 = rd.nextInt(90) + 10;
num2 = rd.nextInt(9) + 1;
resultado = num1 / num2;
System.out.println("Pregunta " + i + ": ¿Cuánto es " + num1 + " / " + num2 + "? (redondea hacia abajo si tienes decimal)");
respuesta = sc.nextInt();
if(respuesta == resultado) {
System.out.println("Muy bien! Excelente! Buen trabajo! Sigue así!");
aciertos++;
} else {
System.out.println("No. Por favor intenta de nuevo. Incorrecto. Intenta una vez mas. No te rindas. No. Sigue intentando.");
}
break;
case 5:
int operacion = rd.nextInt(4) + 1;
switch(operacion) {
case 1:
num1 = rd.nextInt(99) + 1;
num2 = rd.nextInt(99) + 1;
resultado = num1 + num2;
System.out.println("Pregunta " + i + ": ¿Cuánto es " + num1 + " + " + num2 + "?");
respuesta = sc.nextInt();
if(respuesta == resultado) {
System.out.println("Muy bien! Excelente! Buen trabajo! Sigue así!");
aciertos++;
} else {
System.out.println("No. Por favor intenta de nuevo. Incorrecto. Intenta una vez mas. No te rindas. No. Sigue intentando.");
}
break;
case 2:
num1 = rd.nextInt(99) + 1;
num2 = rd.nextInt(num1) + 1;
resultado = num1 - num2;
System.out.println("Pregunta " + i + ": ¿Cuánto es " + num1 + " - " + num2 + "?");
respuesta = sc.nextInt();
if(respuesta == resultado) {
System.out.println("Muy bien! Excelente! Buen trabajo! Sigue así!");
aciertos++;
} else {
System.out.println("No. Por favor intenta de nuevo. Incorrecto. Intenta una vez mas. No te rindas. No. Sigue intentando.");
}
break;
case 3:
num1 = rd.nextInt(90) + 10;
num2 = rd.nextInt(90) + 10;
resultado = num1 * num2;
System.out.println("Pregunta " + i + ": ¿Cuánto es " + num1 + " x " + num2 + "?");
respuesta = sc.nextInt();
if(respuesta == resultado) {
System.out.println("Muy bien! Excelente! Buen trabajo! Sigue así!");
aciertos++;
} else {
System.out.println("No. Por favor intenta de nuevo. Incorrecto. Intenta una vez mas. No te rindas. No. Sigue intentando.");
}
break;
case 4:
num1 = rd.nextInt(90) + 10;
num2 = rd.nextInt(9) + 1;
resultado = num1 / num2;
System.out.println("Pregunta " + i + ": ¿Cuánto es " + num1 + " / " + num2 + "? (redondea hacia abajo si tienes decimal)");
respuesta = sc.nextInt();
if(respuesta == resultado) {
System.out.println("Muy bien! Excelente! Buen trabajo! Sigue así!");
aciertos++;
} else {
System.out.println("No. Por favor intenta de nuevo. Incorrecto. Intenta una vez mas. No te rindas. No. Sigue intentando.");

}
break;
}
break;
default:
System.out.println("Opción inválida.");
}
}

//Mostrar la calificación final
int calificacion = aciertos*10;
System.out.println("Tu calificación final es: " + calificacion);
}

}