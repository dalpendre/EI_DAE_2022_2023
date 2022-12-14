package pt.ipleiria.estg.dei.ei.dae.academics.ejbs;

import pt.ipleiria.estg.dei.ei.dae.academics.Student;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StudentBean
{
    @PersistenceContext
    private EntityManager em;

    public void create(String username, String password, String name, String email)
    {
        Student student = new Student(username, password, name, email);
        em.persist(student);    //saves in database
    }
}
