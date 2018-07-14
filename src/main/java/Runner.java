import db.DBHelper;
import db.DBTeam;
import models.Competition;
import models.Manager;
import models.Player;
import models.Team;

import java.util.List;

public class Runner {

    public static void main(String[] args){

        Manager manager = new Manager("Brendan Rodgers", 53);
        DBHelper.save(manager);

        Player player1 = new Player("Henrik Larsson", 35, "Striker");
        DBHelper.save(player1);

        Player player2 = new Player("Lubo Marvchik", 35, "Attacking midfielder");
        DBHelper.save(player2);

        Competition competition = new Competition("SPL");
        DBHelper.save(competition);

        Competition competition2 = new Competition("Champs League");
        DBHelper.save(competition2);

        Team team = new Team("Celtic", "players", manager, 1, "SPL");
        DBHelper.save(team);

        Manager celticManager = DBTeam.getManager(team);







    }
}
