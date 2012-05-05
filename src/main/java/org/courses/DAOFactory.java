package org.courses;

/**
 * Created by IntelliJ IDEA.
 * User: stvad
 * Date: 19.02.12
 * Time: 15:47
 * To change this template use File | Settings | File Templates.
 */
public class DAOFactory
{
    public static DAOFactory getInstance()
    {

        if (m_instance == null)
            m_instance = new DAOFactory();

        return m_instance;
    }

    public PersonDAO getPersonDAO()
    {
        if(m_personDAO == null)
            m_personDAO = new PersonDAOImpl();

        return m_personDAO;
    }

    private static DAOFactory m_instance = null;

    private static PersonDAO m_personDAO = null;

}
