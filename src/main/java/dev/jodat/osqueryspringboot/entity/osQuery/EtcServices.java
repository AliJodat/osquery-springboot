package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EtcServices {

    public static final String TABLE = "etc_services";

    private String name;
    private String port;
    private String protocol; // Transport protocol (TCP/UDP)
    private String aliases; // Optional space separated list of other names for a service
    private String comment;

}
