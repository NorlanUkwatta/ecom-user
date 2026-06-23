package lk.jiat.ecom.user.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import lk.jiat.ecom.user.remote.TestRemote;

@Stateless
public class TestSessionBean implements TestRemote {

    int i;

    @PostConstruct
    public void init() {
        System.out.println("TestSessionBean init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("TestSessionBean destroy");
    }

    public TestSessionBean() {
        System.out.println("TestSessionBean created");
    }

    @Override
    public String test() {

        i++;

        try {
//            Thread.sleep(5000);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "TestSessionBean: test "+i;
    }
}
