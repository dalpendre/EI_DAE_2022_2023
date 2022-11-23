package pt.ipleiria.estg.dei.ei.dae.academics.ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
@Startup
@Singleton
public class ConfigBean
{
    @EJB
    StudentBean studentBean;

    @PostConstruct
    public void populateDB()
    {
        studentBean.create("dalpendre", "12345",
        "Diogo Alpendre", "dalpendre1999@gmail.com");
    }
}
