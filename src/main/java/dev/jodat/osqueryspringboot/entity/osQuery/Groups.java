package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Groups {

    public static final String TABLE = "groups";

    private Long gid;
    private Long gid_signed;
    private String groupname;

    private String group_sid; // WINDOWS Unique group ID
    private String comment; // WINDOWS Remarks or comments associated with the group

    private Long is_hidden; // DARWIN IsHidden attribute set in OpenDirectory

    private Long pid_with_namespace; // LINUX Pids that contain a namespace", additional=True, hidden=True

}
