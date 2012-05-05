package org.courses;

public class Person
{
	public String getFileName()
    {
        return m_fileName;
    }

    public void setFileName(String fileName)
    {
        this.m_fileName = fileName;
    }

    public void setId(int id)
    {
        m_Id = id;
    }

    public void setSName(String SName)
    {
        this.m_SName = SName;
    }

    public void setAge(int age)
    {
        m_Age = age;
    }

    public void setName(String name)
    {
        m_Name = name;
    }

    public int getAge()
    {
        return m_Age;
    }

    public String getSName()
    {
        return m_SName;
    }

    public String getName()
    {
        return m_Name;
    }

	public Person()
	{
		m_Id = 0;
        m_Name = "";
        m_SName = "";
        m_Age = 0;
        m_fileName = "";
	}

	public int getId()
	{
		return m_Id;
	}

    protected int m_Id;
    protected String m_Name;
    protected String m_SName;
    protected int m_Age;
    protected String m_fileName;

}
