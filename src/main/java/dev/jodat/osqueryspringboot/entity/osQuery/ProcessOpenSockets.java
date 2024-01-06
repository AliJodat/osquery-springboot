package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProcessOpenSockets {

    public static final String TABLE = "process_open_sockets";

    private Long pid; // Process (or thread) ID", additional=Tru
    private Long fd; // Socket file descriptor number
    private Long socket; // Socket handle or inode number
    private Long family; // Network protocol (IPv4, IPv6)
    private Long protocol; // Transport protocol (TCP/UDP)
    private String local_address; // Socket local address
    private String remote_address; // Socket remote address
    private Long local_port; // Socket local port
    private Long remote_port; // Socket remote port
    private String path; // For UNIX sockets (family=AF_UNIX), the domain path
    private String state; // TCP socket state
    private String net_namespace; // LINUX   The inode number of the network namespace


}
