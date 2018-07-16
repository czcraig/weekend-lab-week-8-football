package db;

import models.Competition;
import models.Manager;
import models.Player;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBTeam {

    private static Session session;

    public static Manager getManager(Team team){
        session = HibernateUtil.getSessionFactory().openSession();
        Manager manager = null;

        try{
            Criteria cr = session.createCriteria(Manager.class);
            cr.add(Restrictions.eq("id", team.getManager().getId()));
            manager = (Manager)cr.uniqueResult();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return manager;
    }

    public static void addTeamToCompetition(Team team, Competition competition){
        team.addCompetition(competition);
        competition.addTeam(team);
        DBHelper.update(team);
    }

    public static List getPlayersForTeam(Team team) {
        session = HibernateUtil.getSessionFactory().openSession();
        List results = null;
        try {
            Criteria cr = session.createCriteria(Player.class);
            cr.add(Restrictions.eq("team", team));
            results =  cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;


    }

    public static List <Competition> getCompetitionFromTeam(Team team){
        List<Competition> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Team.class);
            cr.createAlias("teams", "team");
            cr.add(Restrictions.eq("team.id", team.getId()));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }
}
