package dev.jodat.osqueryspringboot;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OS {

    LINUX("linux"),
    WINDOWS("windows"),
    MAC("mac");

    private final String value;

}
