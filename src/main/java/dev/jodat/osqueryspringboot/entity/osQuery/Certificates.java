package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Certificates {

    public static final String TABLE = "certificates";

    private String common_name;
    private String subject;
    private String issuer;
    private Long ca;
    private Long self_signed;
    private String not_valid_before; // DATE
    private String not_valid_after; // DATE
    private String signing_algorithm;
    private String key_algorithm;
    private String key_strength;
    private String key_usage;
    private String subject_key_id;
    private String authority_key_id;
    private String sha1;
    private String path;
    private String serial;
    private String sid;
    private String store_location;
    private String store;
    private String username;
    private String store_id;
    private String issuer2;
    private String subject2;
}
