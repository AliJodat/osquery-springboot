package dev.jodat.osqueryspringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class Data {

    public static Map<String, List<OS>> TABLES = new HashMap<>();

    public static String[] START_COMMAND = {"osqueryi", "--json"};

    @Bean
    public void fillTables() {
        TABLES.put("account_policy_data" , List.of(OS.MAC));
        TABLES.put("acpi_tables" , List.of(OS.MAC, OS.LINUX));
        TABLES.put("ad_config" , List.of(OS.MAC));
        TABLES.put("alf" , List.of(OS.MAC));
        TABLES.put("alf_exceptions" , List.of(OS.MAC));
        TABLES.put("alf_explicit_auths" , List.of(OS.MAC));
        TABLES.put("app_schemes" , List.of(OS.MAC));
        TABLES.put("apparmor_events" , List.of(OS.LINUX));
        TABLES.put("apparmor_profiles" , List.of(OS.LINUX));
        TABLES.put("appcompat_shims" , List.of(OS.WINDOWS));
        TABLES.put("apps" , List.of(OS.MAC));
        TABLES.put("apt_sources" , List.of(OS.LINUX));
        TABLES.put("arp_cache" , List.of(OS.LINUX, OS.WINDOWS, OS.MAC));
    }

}
