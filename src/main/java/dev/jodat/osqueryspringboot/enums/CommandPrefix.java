package dev.jodat.osqueryspringboot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommandPrefix {

    OS_QUERY_I("osqueryi");

    private final String value;
}
