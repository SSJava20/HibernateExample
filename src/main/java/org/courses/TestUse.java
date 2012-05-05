package org.courses;

import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: stvad
 * Date: 05.05.12
 * Time: 21:17
 * To change this template use File | Settings | File Templates.
 */
public class TestUse
{
    public static void main(String[] args) throws SQLException
    {
        Person testPerson = new Person();
        DAOFactory.getInstance().getPersonDAO().AddPerson(testPerson);
        DAOFactory.getInstance().getPersonDAO().AddPerson(testPerson);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        String query = "SELECT * FROM person";
        List<Person> persons = new ArrayList<Person>();
        persons = (List<Person>) session.createSQLQuery(query).list();
        session.getTransaction().commit();

    }
}
