package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoggedInUsers {
    public static final String TABLE = "logged_in_users";

    private String type; // Login type
    private String user; // User login name
    private String tty; // Device name
    private String host; // Remote hostname
    private Long time; // Time entry was made
    private Long pid; // Process (or thread) ID
    private String sid; // WINDOWS The user's unique security identifier
    private String registry_hive; // WINDOWS HKEY_USERS registry hive

}
