package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarbonBlackInfo {

    public static final String TABLE = "azure_instance_tags";

    private Long sensor_id;
    private String config_name;
    private Long collect_store_files;
    private Long collect_module_loads;
    private Long collect_module_info;
    private Long collect_file_mods;
    private Long collect_reg_mods;
    private Long collect_net_conns;
    private Long collect_processes;
    private Long collect_cross_processes;
    private Long collect_emet_events;
    private Long collect_data_file_writes;
    private Long collect_process_user_context;
    private Long collect_sensor_operations;
    private Long log_file_disk_quota_mb;
    private Long log_file_disk_quota_percentage;
    private Long protection_disabled;
    private String sensor_ip_addr;
    private String sensor_backend_server;
    private Long event_queue;
    private Long binary_queue;

}