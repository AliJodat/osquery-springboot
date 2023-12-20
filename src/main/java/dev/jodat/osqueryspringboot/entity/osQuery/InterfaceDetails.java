package dev.jodat.osqueryspringboot.entity.osQuery;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterfaceDetails {

    public static final String TABLE = "interface_details";

    @JsonProperty(value = "interface")
    private String interfaceName; // Interface name
    private String mac; // MAC of interface (optional)
    private Long type; // Interface type (includes virtual)
    private Long mtu; // Network MTU
    private Long metric; // Metric based on the speed of the interface
    private Long flags; // Flags (netdevice) for the device
    private Long ipackets; // Input packets
    private Long opackets; // Output packets
    private Long ibytes; // Input bytes
    private Long obytes; // Output bytes
    private Long ierrors; // Input errors
    private Long oerrors; // Output errors
    private Long idrops; // Input drops
    private Long odrops; // Output drops
    private Long collisions; // Packet Collisions detected
    private Long last_change; // Time of last device modification (optional)

    private Long link_speed; // Interface speed in Mb/s POSIX
    private String pci_slot; // PCI slot number LINUX

    // WINDOWS
    private String friendly_name; // The friendly display name of the interface.
    private String description; // Short description of the object a one-line string.
    private String manufacturer; // Name of the network adapter's manufacturer.
    private String connection_id; // Name of the network connection as it appears in the Network Connections Control Panel program.
    private String connection_status; // State of the network adapter connection to the network.
    private Long enabled; // Indicates whether the adapter is enabled or not.
    private Long physical_adapter; // Indicates whether the adapter is a physical or a logical adapter.
    private Long speed; // Estimate of the current bandwidth in bits per second.
    private String service; // The name of the service the network adapter uses.
    private Long dhcp_enabled; // If TRUE, the dynamic host configuration protocol (DHCP) server automatically assigns an IP address to the computer system when establishing a network connection.
    private String dhcp_lease_expires; // Expiration date and time for a leased IP address that was assigned to the computer by the dynamic host configuration protocol (DHCP) server.
    private String dhcp_lease_obtained; // Date and time the lease was obtained for the IP address assigned to the computer by the dynamic host configuration protocol (DHCP) server.
    private String dhcp_server; // IP address of the dynamic host configuration protocol (DHCP) server.
    private String dns_domain; // Organization name followed by a period and an extension that indicates the type of organization, such as 'microsoft.com'.
    private String dns_domain_suffix_search_order; // Array of DNS domain suffixes to be appended to the end of host names during name resolution.
    private String dns_host_name; // Host name used to identify the local computer for authentication by some utilities.
    private String dns_server_search_order; // Array of server IP addresses to be used in querying for DNS servers.

}
