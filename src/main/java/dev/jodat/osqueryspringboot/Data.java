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
        TABLES.put("asl" , List.of(OS.MAC));
        TABLES.put("atom_packages" , List.of(OS.LINUX, OS.WINDOWS, OS.MAC));
        TABLES.put("augeas" , List.of(OS.MAC, OS.LINUX));
        TABLES.put("authenticode" , List.of(OS.WINDOWS));
        TABLES.put("authorization_mechanisms" , List.of(OS.MAC));
        TABLES.put("authorizations" , List.of(OS.MAC));
        TABLES.put("authorized_keys" , List.of(OS.MAC, OS.LINUX));
        TABLES.put("autoexec" , List.of(OS.WINDOWS));
        TABLES.put("azure_instance_metadata" , List.of(OS.LINUX, OS.WINDOWS, OS.MAC));
        TABLES.put("azure_instance_tags" , List.of(OS.LINUX, OS.WINDOWS, OS.MAC));
        TABLES.put("background_activities_moderator" , List.of(OS.WINDOWS));
        TABLES.put("battery" , List.of(OS.MAC));
        TABLES.put("bitlocker_info" , List.of(OS.WINDOWS));
    }

}
