package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChromeExtensions {

    public static final String TABLE = "chrome_extensions";

    private String browser_type;
    private Long uid;
    private String name;
    private String profile;
    private String profile_path;
    private String referenced_identifier;
    private String identifier;
    private String version;
    private String description;
    private String default_locale;
    private String current_locale;
    private String update_url;
    private String author;
    private Long persistent;
    private String path;
    private String permissions;
    private String permissions_json;
    private String optional_permissions;
    private String optional_permissions_json;
    private String manifest_hash;
    private Long referenced;
    private String from_webstore;
    private String state;
    private String install_time;
    private Long install_timestamp;
    private String manifest_json;
    private String key;
    private String userUid;  // ForeignKey table="users"

}
