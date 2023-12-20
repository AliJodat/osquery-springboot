package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    public static final String TABLE = "users";

    private Long uid;
    private Long gid;
    private Long uid_signed;
    private Long gid_signed;
    private String username;
    private String description;
    private String directory;
    private String shell;
    private String uuid;
    private String type;
    private Long is_hidden;
    private Long pid_with_namespace;

}



