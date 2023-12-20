package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EtcHosts {

    public static final String TABLE = "etc_hosts";

    private String address;
    private String hostnames;
    private String pid_with_namespace; // Pids that contain a namespace", additional=True, hidden=True LINUX

}
