package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AzureInstanceTags {

    public static final String TABLE = "azure_instance_tags";

    private String vm_id;
    private String key;
    private String value;

}