package lk.jiat.user.bean;


import jakarta.ejb.Stateless;
import lk.jiat.user.remote.TestRemote;

@Stateless
public class TestSessionBean implements TestRemote {
    @Override
    public void test() {
        System.out.println("TestSessionBean: test");
    }
}
