package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OsVersion {

    public static final String TABLE = "os_version";

    private String name; // Distribution or product name
    private String version; // Pretty, suitable for presentation, OS version
    private Long major; // Major release version
    private Long minor; // Minor release version
    private Long patch; // Optional patch release
    private String build; // Optional build-specific or variant string
    private String platform; // OS Platform or ID
    private String platform_like; // Closely related platforms
    private String codename; // OS version codename
    private String arch; // OS Architecture
    private String extra; // DARWIN Optional extra release specification
    private Long install_date; // WINDOWS The install date of the OS.
    private Long pid_with_namespace; // LINUX Pids that contain a namespace
    private String mount_namespace_id; // LINUX Mount namespace id

}
