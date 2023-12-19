package dev.jodat.osqueryspringboot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommandOption {

    OS_QUERY_JSON("--json"),
    OS_QUERY_CSV("--csv");

    private final String value;

}
