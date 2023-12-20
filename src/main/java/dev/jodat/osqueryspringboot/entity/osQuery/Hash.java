package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hash {

    public static final String TABLE = "hash";

    private String path; // Must provide a path or directory", index=True, required=True
    private String directory; // Must provide a path or directory, required=True
    private String md5; // MD5 hash of provided filesystem data
    private String sha1; // SHA1 hash of provided filesystem data
    private String sha256; // SHA256 hash of provided filesystem data
    private Long pid_with_namespace; // Pids that contain a namespace LINUX
    private String mount_namespace_id; // Mount namespace id LINUX

}
