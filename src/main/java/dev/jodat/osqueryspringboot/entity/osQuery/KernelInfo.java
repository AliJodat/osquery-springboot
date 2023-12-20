package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KernelInfo {

    public static final String TABLE = "kernel_info";
    private String version;
    private String arguments;
    private String path;
    private String device; // Kernel device identifier

}
