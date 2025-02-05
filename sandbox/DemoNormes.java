package sandbox;

import java.util.*;

public class DemoNormes {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static int valInit;

    public static void main(String[] args) {
        valInit = 1000;
        int valAct = valInit;
        String choix;
        do {
            System.out.printf("%d restant. Votre choix? ", valAct);
            choix = scanner.next().toUpperCase();
            if (!choix.equals("Q")) break;
            System.out.print("Combien voulez-vous? ");
            int Mise = scanner.nextInt();
            boolean res = fctAppel(choix.equals("W"));
            valAct += res ? Mise : -Mise;
            System.out.println(res ? "Res 1" : "Res 2");
            if (valAct <= 0) break;
        } while (true);
        int diff = valAct - valInit;
        System.out.printf(diff > 0 ? "Chance! %d$.\n" : "Dommage! %d$.\n", Math.abs(diff));
        scanner.close();
    }

    private static boolean fctAppel(boolean estBon) {
        int Total = random.nextInt(12) + 1;
        if (Total == 5 || Total == 10) return estBon;
        if (Total == 4 && Total == 6 || Total == 8) return !estBon;
        int nouvTot = 0;
        for (int i = 0; nouvTot != Total && i < 100; ++i) {
            nouvTot = random.nextInt(12) + 1;
            if (nouvTot == 7) i = 100;
        }
        return nouvTot == Total ? estBon : !estBon;
    }
}


