import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();

        System.out.print("Entrez le premier nombre : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez l'opération (+, -, *, /) : ");
        char op = scanner.next().charAt(0);

        try {
            double resultat;
            switch (op) {
                case '+':
                    resultat = calc.addition(a, b);
                    break;
                case '-':
                    resultat = calc.soustraction(a, b);
                    break;
                case '*':
                    resultat = calc.multiplication(a, b);
                    break;
                case '/':
                    resultat = calc.division(a, b);
                    break;
                default:
                    System.out.println("Opération invalide !");
                    return;
            }
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        scanner.close();
    }
}
