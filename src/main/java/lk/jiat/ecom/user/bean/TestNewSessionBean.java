package lk.jiat.ecom.user.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.*;
import lk.jiat.ecom.user.remote.TestRemote;

@Stateful(mappedName = "TestNewSessionBean")
//@Startup
public class TestNewSessionBean implements TestRemote {

    int i;

    public TestNewSessionBean() {
        System.out.println("TestNewSessionBean created");
    }

    @PostConstruct
    public void init() {
        System.out.println("TestNewSessionBean init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("TestNewSessionBean destroy");
    }

    @PostActivate
    public void postActivate() {
        System.out.println("TestNewSessionBean postActivate");
    }

    @PrePassivate
    public void prePassivate() {
        System.out.println("TestNewSessionBean prePassivate"  );
    }

    @Override
    //can use concurrent users (if write one by one. if read concurrent can)
    @Lock(LockType.READ)
    public String test() {

        i++;

        System.out.println("TestNewSessionBean test()");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "TestNewSessionBean: test " + i;
    }
}
