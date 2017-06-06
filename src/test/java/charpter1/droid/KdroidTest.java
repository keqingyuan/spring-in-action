package charpter1.droid;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by qingyuan on 6/6/17.
 */
public class KdroidTest {
    @Test
    public void workOnTadk() throws Exception {
        Kdroid kdroid = new Kdroid("onion");
        String work = kdroid.workOnTadk();

        System.out.println(work);
    }

}