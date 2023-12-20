package dev.jodat.osqueryspringboot.service.osQuery;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.jodat.osqueryspringboot.entity.osQuery.InterfaceDetails;
import dev.jodat.osqueryspringboot.service.CommandLineExecute;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class InterfaceDetailsServiceImpl implements InterfaceDetailsService {

    CommandLineExecute commandLineExecute;
    ObjectMapper objectMapper;

    @Override
    public List<InterfaceDetails> list() {
        String stringResult = commandLineExecute.run(List.of("osqueryi", "--json", "select * from interface_details;"));
        List<InterfaceDetails> result;
        try {
            result = objectMapper.readValue(stringResult, new TypeReference<>() {
            });
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return result;

    }


}
