package dev.jodat.osqueryspringboot.service.osQuery;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.jodat.osqueryspringboot.enums.CommandOption;
import dev.jodat.osqueryspringboot.enums.CommandPrefix;
import dev.jodat.osqueryspringboot.service.CommandLineExecute;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UsersServiceImpl implements UsersService {

    CommandLineExecute commandLineExecute;
    ObjectMapper objectMapper;

    @Override
    public List<Map<String, Object>> usersList() {

        String query = " select * from users;";

        String result = commandLineExecute.run(CommandPrefix.OS_QUERY_I.getValue(), CommandOption.OS_QUERY_JSON.getValue(), query);
        List<Map<String, Object>> obj;
        try {
            obj = objectMapper.readValue(result, new TypeReference<>() {
            });
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }

}
