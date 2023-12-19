package dev.jodat.osqueryspringboot.web.controller;

import dev.jodat.osqueryspringboot.service.CommandLineExecute;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/command-line-execute")
public class CommandLineExecuteController {

    CommandLineExecute commandLineExecute;

    @PostMapping(value = "/run", produces = "text/plain")
    public String run(@RequestBody List<String> commands) {
        return commandLineExecute.run(commands.toArray(new String[0]));
    }

}
