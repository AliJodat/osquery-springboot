package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AzureInstanceMetadata {

    public static final String TABLE = "azure_instance_metadata";

    private String location;
    private String name;
    private String offer;
    private String publisher;
    private String sku;
    private String version;
    private String os_type;
    private String platform_update_domain;
    private String platform_fault_domain;
    private String vm_id;
    private String vm_size;
    private String subscription_id;
    private String resource_group_name;
    private String placement_group_id;
    private String vm_scale_set_name;
    private String zone;

}