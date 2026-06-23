package lk.jiat.ecom.user.remote;

import jakarta.ejb.Remote;

@Remote
public interface TestRemote {
    String test();
}
