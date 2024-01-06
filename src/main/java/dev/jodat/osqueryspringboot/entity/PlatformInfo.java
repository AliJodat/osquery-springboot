package dev.jodat.osqueryspringboot.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatformInfo {

    public static final String TABLE = "platform_info";

    private String vendor; // Platform code vendor
    private String version; // Platform code version
    private String date; // Self-reported platform code update date
    private String revision; // BIOS major and minor revision
    private String extra; // Platform-specific additional information
    private String firmware_type; // The type of firmware (uefi, bios, iboot, openfirmware, unknown)
    private String address; // LINUX + DARWIN   Relative address of firmware mapping
    private String size; // LINUX + DARWIN   Size in bytes of firmware
    private String volume_size; // LINUX + DARWIN   (Optional) size of firmware volume

}
