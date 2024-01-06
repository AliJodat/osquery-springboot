package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NpmPackages {

    public static final String TABLE = "npm_packages";

    private String name; // Package display name
    private String version; // Package-supplied version
    private String description; // Package-supplied description
    private String author; // Package-supplied author
    private String license; // License under which package is launched
    private String homepage; // Package supplied homepage
    private String path; // Path at which this module resides
    private String directory; // Directory where node_modules are located
    private String pid_with_namespace; // LINUX Pids that contain a namespace
    private String mount_namespace_id; // LINUX Mount namespace id

}
