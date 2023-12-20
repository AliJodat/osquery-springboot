package dev.jodat.osqueryspringboot.entity.osQuery;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArpCache {

    public static final String TABLE = "arp_cache";

    private String address;
    private String mac;

    @JsonProperty(value = "interface")
    private String interfaceField;

    private String permanent;
}
