import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String formula, subFormula;
        double n1, n2, resultado = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a formula: ");
        formula = ler.nextLine();

        int fim = formula.length();
        int local;
        int conta;

        while (!formula.isEmpty()) {

            if (formula.indexOf("+", 1) != -1) {

                // local para a separação dos numeros
                local = formula.indexOf("+", 1);
                subFormula = formula.substring(0, local).trim();

                if (subFormula.indexOf("-", 1) != -1) {

                    local = subFormula.indexOf("-");
                    n1 = Double.parseDouble(formula.substring(0, local));

                } else {

                    n1 = Double.parseDouble(formula.substring(0, local).trim());

                }

                formula = formula.substring(local, fim).trim();
                fim = formula.length();
                resultado += n1;

            } else if (formula.indexOf("-", 1) != -1) {

                // local para a separação dos numeros
                local = formula.indexOf("-", 1);

                n1 = Double.parseDouble(formula.substring(0, local).trim());

                formula = formula.substring(local, fim).trim();
                fim = formula.length();
                resultado += n1;

            } else {

                n1 = Double.parseDouble(formula.trim());
                resultado += n1;
                formula = "";

            }

        }

        System.out.println("O Resultado é: " + resultado);

    }
}