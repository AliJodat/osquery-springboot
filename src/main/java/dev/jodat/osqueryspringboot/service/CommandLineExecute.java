package dev.jodat.osqueryspringboot.service;

import java.util.List;

public interface CommandLineExecute {
    String run(String... commands);

    String run(List<String> commands);
}
