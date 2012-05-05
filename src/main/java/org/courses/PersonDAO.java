package org.courses;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: stvad
 * Date: 19.02.12
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
public interface PersonDAO
{
    public void AddPerson(Person person) throws SQLException;
    public void UpdatePerson(int person_id, Person bus) throws SQLException;
    public Person GetPersonById(int bus_id) throws SQLException;
    public Collection GetAllPersons() throws SQLException;
    public void DeletePerson(Person bus) throws SQLException;
}
