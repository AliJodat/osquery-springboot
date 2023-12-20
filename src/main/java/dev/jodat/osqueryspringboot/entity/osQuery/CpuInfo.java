package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CpuInfo {

    public static final String TABLE = "cpu_info";

    private String device_id; //The DeviceID of the CPU.
    private String model; //The model of the CPU.
    private String manufacturer; //The manufacturer of the CPU.
    private String processor_type; //The processor type, such as Central, Math, or Video.
    private String cpu_status; //The current operating status of the CPU.
    private String number_of_cores; //The number of cores of the CPU.
    private String logical_processors; //The number of logical processors of the CPU.
    private String address_width; //The width of the CPU address bus.
    private String current_clock_speed; //The current frequency of the CPU.
    private String max_clock_speed; //The maximum possible frequency of the CPU.
    private String socket_designation; //The assigned socket on the board for the given CPU.
    private String availability; // The availability and status of the CPU. WINDOWS
    private String number_of_efficiency_cores; // The number of efficiency cores of the CPU. Only available on Apple Silicon  DARWIN
    private String number_of_performance_cores; // The number of performance cores of the CPU. Only available on Apple Silicon  DARWIN


}
