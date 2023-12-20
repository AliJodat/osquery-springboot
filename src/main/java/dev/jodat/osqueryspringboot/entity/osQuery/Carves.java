package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carves {

    public static final String TABLE = "carves";

    private Long time;
    private String sha256;
    private Long size;
    private String path;
    private String status;
    private String carve_guid;
    private String request_id;
    private Long carve;
}
