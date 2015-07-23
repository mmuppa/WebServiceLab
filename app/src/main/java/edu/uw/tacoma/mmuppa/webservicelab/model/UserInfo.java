package edu.uw.tacoma.mmuppa.webservicelab.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class UserInfo {

    /**
     * An array of sample (dummy) items.
     */
    public static List<User> ITEMS = new ArrayList<User>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, User> ITEM_MAP = new HashMap<String, User>();

    static {
        // Add 3 sample items.
        addItem(new User("1", "Item 1"));
        addItem(new User("2", "Item 2"));
        addItem(new User("3", "Item 3"));
    }

    private static void addItem(User item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.email, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class User {
        public String email;
        public String pwd;

        public User(String email, String pwd) {
            this.email = email;
            this.pwd = pwd;
        }

        @Override
        public String toString() {
            return email;
        }
    }
}
