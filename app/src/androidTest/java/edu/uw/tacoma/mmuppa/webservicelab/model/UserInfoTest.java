package edu.uw.tacoma.mmuppa.webservicelab.model;

import junit.framework.TestCase;

/**
 * Created by mmuppa on 8/6/15.
 */
public class UserInfoTest extends TestCase {
    public void testConstructor() {
        UserInfo.User user = new UserInfo.User("test", "testing");
        assertNotNull(user);
    }

    public void testToString() {
        UserInfo.User user = new UserInfo.User("test", "testing");
        assertEquals("test", user.toString());
    }

}
