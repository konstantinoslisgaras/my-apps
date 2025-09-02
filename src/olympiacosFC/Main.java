package olympiacosFC;

import static olympiacosFC.Players.printPlayers;
import static olympiacosFC.Players.teamTotals;

/**
 * Keeps goals and assists records for Olympiacos FC for season 2025-2026.
 * --
 * @version 0.0.1
 * @since 0.0.1
 * @author konstantinoslisgaras
 */

public class Main {

    static int matchNumber = 0;

    public static void main(String[] args) {
        //************************************************************************************************************//
        System.out.printf("Match number: %02d | OLYMPIACOS SFP 2 - 0 Asteras Tripolis (23/08/25)%n", ++matchNumber);
        System.out.println("1-0: Yazici (Mouzakitis), 2-0: El Kaabi (Nascimento)\n");

        Players Yazici = new Players("Yazici", 97, "Yusuf", "Türkiye", 1997);
        Players Mouzakitis = new Players("Mouzakitis", 96, "Christos", "Greece", 2006);
        Players ElKaabi = new Players("El Kaabi", 9, "Ayoub", "Morocco", 1993);
        Players Nascimento = new Players("Nascimento", 8, "Diogo", "Portugal", 2002);

        Yazici.addGoal(1); Mouzakitis.addAssist(1);
        ElKaabi.addGoal(1); Nascimento.addAssist(1);
        //************************************************************************************************************//
        System.out.printf("Match number: %02d | Olympiacos Volou 0 - 2 OLYMPIACOS SFP (30/08/25)%n", ++matchNumber);
        System.out.println("0-1: Chiquinho (Strefezza), 0-2: Retsos (Chiquinho)\n");

        Players Chiquinho = new Players("Chiquinho", 22, "Francisco", "Portugal", 1995);
        Players Strefezza = new Players("Strefezza", 27, "Gabriel", "Brazil", 1997);
        Players Retsos = new Players("Retsos", 45, "Panagiotis", "Greece", 1998);

        Chiquinho.addGoal(1); Strefezza.addAssist(1);
        Retsos.addGoal(1); Chiquinho.addAssist(1);

        System.out.println(Retsos.getShirtNumber());

        System.out.println(teamTotals());
        // move to external all and add find by number

        printPlayers();
    }

    private static void addPlayer() {
        // move to external all and add find by number
    }
}