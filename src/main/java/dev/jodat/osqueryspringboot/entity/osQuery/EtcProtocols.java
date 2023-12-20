package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EtcProtocols {

    public static final String TABLE = "etc_protocols";

    private String name;
    private Long number;
    private String alias;
    private String comment;

}
