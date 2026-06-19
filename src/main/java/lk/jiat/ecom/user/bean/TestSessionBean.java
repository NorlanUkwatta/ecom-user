package lk.jiat.ecom.user.bean;

import jakarta.ejb.Stateless;
import lk.jiat.ecom.user.remote.TestRemote;

@Stateless
public class TestSessionBean implements TestRemote {
    @Override
    public void test() {
        System.out.println("test: TestSessionBean");
    }
}
