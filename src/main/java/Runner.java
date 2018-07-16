import db.DBCompetition;
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

        Manager manager2 = new Manager("Neil Lennon", 43);
       DBHelper.save(manager2);

        Team team = new Team("Celtic", manager, 1);
      DBHelper.save(team);

        Team team2 = new Team("Hibernian", manager2, 2);
        DBHelper.save(team2);


        Player player1 = new Player("Henrik Larsson", 35, "Striker", team);
       DBHelper.save(player1);

        Player player2 = new Player("Lubo Moravcik", 35, "Attacking midfielder", team);
        DBHelper.save(player2);

        Competition competition = new Competition("SPL");
       DBHelper.save(competition);

        Competition competition2 = new Competition("Champs League");
       DBHelper.save(competition2);

        DBTeam.addTeamToCompetition(team, competition);
        DBTeam.addTeamToCompetition(team2,competition);



        Manager celticManager = DBTeam.getManager(team);

        List<Player> playersInCelticTeam = DBTeam.getPlayersForTeam(team);

        List<Competition> competitions = DBTeam.getCompetitionFromTeam(team);

        List<Team> teams = DBCompetition.getTeamsCompetitions(competition);





    }
}
