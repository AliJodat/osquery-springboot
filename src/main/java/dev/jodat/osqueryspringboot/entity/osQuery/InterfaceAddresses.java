package dev.jodat.osqueryspringboot.entity.osQuery;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterfaceAddresses {

    public static final String TABLE = "interface_addresses";

    @JsonProperty(value = "interface")
    private String interfaceName; // Interface name
    private String address; // Specific address for interface
    private String mask; // Interface netmask
    private String broadcast; // Broadcast address for the interface
    private String point_to_point; // PtP address for the interface
    private String type; // Type of address. One of dhcp, manual, auto, other, unknown
    private String friendly_name; // The friendly display name of the interface. WINDOWS

}
