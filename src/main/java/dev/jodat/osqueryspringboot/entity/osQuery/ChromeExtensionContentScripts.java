package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChromeExtensionContentScripts {

    public static final String TABLE = "chrome_extension_content_scripts";

    private String browser_type;
    private String uid;
    private String identifier;
    private String version;
    private String script;
    private String match;
    private String profile_path;
    private String path;
    private String referenced;

    private String userUid; // ForeignKey table="users"
}
