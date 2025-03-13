import controlflow.ControlFlow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Suma 3 broja je: " + PrimitiveTypes.calculateSum(3647, 361245345, 3487238));
        System.out.println("Kvadrat broja je : " + PrimitiveTypes.calculatePower(3,9));
        System.out.println("PI broj je: " + Math.PI);
        System.out.println("Rezultat usporedbe brojeva je: " + ControlFlow.checkNumbers());
        System.out.println("Provjera slova: " + ControlFlow.letterVerification());
    }
}