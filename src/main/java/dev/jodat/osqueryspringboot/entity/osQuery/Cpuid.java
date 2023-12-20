package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cpuid {

    public static final String TABLE = "cpuid";

    private String feature; // Present feature flags
    private String value; // Bit value or string
    private String output_register; // Register used to for feature value
    private String output_bit; // Bit in register value for feature value
    private String input_eax; // Value of EAX used
}
