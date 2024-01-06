package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListeningPorts {

    public static final String TABLE = "listening_ports";

    private Long pid; // Process (or thread) ID
    private Long port; // Transport layer port
    private Long protocol; // Transport protocol (TCP/UDP)
    private Long family; // Network protocol (IPv4, IPv6)
    private String address; // Specific address for bind
    private Long fd; // Socket file descriptor number
    private Long socket; // Socket handle or inode number
    private String path; // Path for UNIX domain sockets
    private String net_namespace; // LINUX  The inode number of the network namespace

}
