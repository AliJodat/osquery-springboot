package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FirefoxAddons {

    public static final String TABLE = "firefox_addons";

    private Long uid; // The local user that owns the addon,additional=True
    private String name; //  "Addon display name
    private String identifier; //  "Addon identifier", index=Tru
    private String creator; //  "Addon-supported creator string
    private String type; //  "Extension, addon, webapp
    private String version; //  "Addon-supplied version string
    private String description; //  "Addon-supplied description string
    private String source_url; //  "URL that installed the addon
    private Long visible; //  "1 If the addon is shown in browser else 0
    private Long active; //  "1 If the addon is active else 0
    private Long disabled; //  "1 If the addon is application-disabled else 0
    private Long autoupdate; //  "1 If the addon applies background updates else 0
    private String location; //  "Global, profile location
    private String path; //  "Path to plugin bundle
    private String userUid; // column="uid", table="users"

}
