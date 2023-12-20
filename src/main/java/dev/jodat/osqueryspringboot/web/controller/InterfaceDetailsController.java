package dev.jodat.osqueryspringboot.web.controller;

import dev.jodat.osqueryspringboot.entity.osQuery.InterfaceDetails;
import dev.jodat.osqueryspringboot.service.osQuery.InterfaceDetailsService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RestController
@RequestMapping("/os-query/interface-details")
public class InterfaceDetailsController {

    InterfaceDetailsService interfaceDetailsService;
    @GetMapping("/list")
    public List<InterfaceDetails> list(){
        return interfaceDetailsService.list();
    }
}
