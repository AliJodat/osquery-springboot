package dev.jodat.osqueryspringboot.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class CommandLineExecuteImpl implements CommandLineExecute {

    @Override
    public String run(String... commands) {
        return execute(commands);
    }

    @Override
    public String run(List<String> commands) {
        return run(commands.toArray(new String[0]));
    }

    public String execute(String... args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(args);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            int exitCode = process.waitFor();
            return result.toString();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
