package db;

import models.Competition;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCompetition {

    private static Session session;

    public static void addTeamToCompetition(Team team, Competition competition){
        team.addCompetition(competition);
        competition.addTeam(team);
        DBHelper.update(team);
    }

//    public static List getTeamsCompetitions(Competition competition) {
//        List<Team> results = null;
//        session = HibernateUtil.getSessionFactory().openSession();
//        try {
//            Criteria cr = session.createCriteria(Team.class);
//            cr.createAlias("competitions", "competition");
//            cr.add(Restrictions.eq("competition.id", competition.getId()));
//            results = cr.list();
//        } catch (HibernateException ex) {
//            ex.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return results;
//    }



        public static List<Team> getTeamsCompetitions(Competition competition){
            List<Team> results = null;
            session = HibernateUtil.getSessionFactory().openSession();
            try {
                Criteria cr = session.createCriteria(Team.class);
                cr.createAlias("competitions", "competition");
                cr.add(Restrictions.eq("competition.id", competition.getId()));
                results = cr.list();
            } catch (HibernateException ex){
                ex.printStackTrace();
            } finally {
                session.close();
            }
            return results;

        }
    }


