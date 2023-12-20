package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ec2InstanceTags {

    public static final String TABLE = "ec2_instance_tags";

    private String instance_id;
    private String key;
    private String value;

}
