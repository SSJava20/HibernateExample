package org.courses;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	static
    {
		try
        {
			m_sessionFactory = new Configuration().configure()
					.buildSessionFactory();
		} catch (Throwable ex)
        {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory()
    {
		return m_sessionFactory;
	}

    private static final SessionFactory m_sessionFactory;

}
