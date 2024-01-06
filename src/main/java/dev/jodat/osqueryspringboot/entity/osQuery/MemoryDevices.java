package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoryDevices {
    public static final String TABLE = "memory_devices";

    private String handle; // Handle, or instance number, associated with the structure in SMBIOS
    private String array_handle; // The memory array that the device is attached to
    private String form_factor; // Implementation form factor for this memory device
    private String total_width; // Total width, in bits, of this memory device, including any check or error-correction bits
    private String data_width; // Data width, in bits, of this memory device
    private String size; // Size of memory device in Megabyte
    private String set; // Identifies if memory device is one of a set of devices.  A value of 0 indicates no set affiliation.
    private String device_locator; // String number of the string that identifies the physically-labeled socket or board position where the memory device is located
    private String bank_locator; // String number of the string that identifies the physically-labeled bank where the memory device is located
    private String memory_type; // Type of memory used
    private String memory_type_details; // Additional details for memory device
    private String max_speed; // Max speed of memory device in megatransfers per second (MT/s)
    private String configured_clock_speed; // Configured speed of memory device in megatransfers per second (MT/s)
    private String manufacturer; // Manufacturer ID string
    private String serial_number; // Serial number of memory device
    private String asset_tag; // Manufacturer specific asset tag of memory device
    private String part_number; // Manufacturer specific serial number of memory device
    private String min_voltage; // Minimum operating voltage of device in millivolts
    private String max_voltage; // Maximum operating voltage of device in millivolts
    private String configured_voltage; // Configured operating voltage of device in millivolts


}
