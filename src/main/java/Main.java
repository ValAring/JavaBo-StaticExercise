/*
Schritt 1: Erstellt eine Klasse mit einer statischen Variable 'totalCount' und einer instanziellen Variable 'instanceCount'.
Initialisiert beide Variablen mit dem Wert 0.
Schritt 2: Schreibt eine statische Methode 'incrementTotalCount', die die 'totalCount' um 1 erhöht.
Schritt 3: Schreibt eine instanzielle Methode 'incrementInstanceCount', die die 'instanceCount' für das Objekt um 1 erhöht.
Schritt 4: Erstellt in der main-Methode mehrere Objekte der Klasse und ruft sowohl die statische als auch die instanzielle
Methode auf.
Schritt 5: Gebt nach den Methodenaufrufen die aktuellen Werte von 'totalCount' und 'instanceCount' aus.

BONUS
Erstellt eine neue Klasse 'Calculator' mit einer statischen Methode 'add', die zwei Zahlen als Parameter entgegennimmt
und ihre Summe zurückgibt.
Schreibt in der main-Methode Code, um die 'add'-Methode aufzurufen und das Ergebnis auszugeben.
Optional: Implementiert weitere statische Methoden in der 'Calculator'-Klasse (Subtraktion, Multiplikation, Division)
und ruft sie in der main-Methode auf.
 */

import calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Statischen Variablen und instanzielle Variablen");

        StaticExcercise st1 = new StaticExcercise();
        StaticExcercise st2 = new StaticExcercise();
        StaticExcercise st3 = new StaticExcercise();

        st1.incTC();
        st1.incIC();

        System.out.println("1. St1: "+st1.totalCount+"tC, "+st1.instanceCount+"iC");

        st2.incTC();
        st2.incTC();
        st2.incIC();
        st2.incIC();

        System.out.println("2. St1: "+st1.totalCount+"tC, "+st1.instanceCount+"iC");
        System.out.println("1. St2: "+st2.totalCount+"tC, "+st2.instanceCount+"iC");

        st3.incTC();
        st3.incTC();
        st3.incTC();
        st3.incIC();
        st3.incIC();
        st3.incIC();

        System.out.println("3. St1: "+st1.totalCount+"tC, "+st1.instanceCount+"iC");
        System.out.println("2. St2: "+st2.totalCount+"tC, "+st2.instanceCount+"iC");
        System.out.println("1. St3: "+st3.totalCount+"tC, "+st3.instanceCount+"iC");



        System.out.println("--------Calculator-------");

        int num1 = 10;
        int num2 = 5;

        int sum = Calculator.add(num1, num2);
        int difference = Calculator.subtract(num1, num2);
        int product = Calculator.multiply(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        double num3 = 10.0;
        double num4 = 3.0;
    }
}