package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurlCertificate {

    public static final String TABLE = "curl_certificate";

    private String hostname; // Hostname to CURL (domain[:port], e.g. osquery.io, #TODO required=True
    private String common_name; // Common name of company issued to
    private String organization; // Organization issued to
    private String organization_unit; // Organization unit issued to
    private String serial_number; // Certificate serial number
    private String issuer_common_name; // Issuer common name
    private String issuer_organization; // Issuer organization
    private String issuer_organization_unit; // Issuer organization unit
    private String valid_from; // Period of validity start date
    private String valid_to; // Period of validity end date
    private String sha256_fingerprint; // SHA-256 fingerprint
    private String sha1_fingerprint; // SHA1 fingerprint
    private String version; // Version Number
    private String signature_algorithm; // Signature Algorithm
    private String signature; // Signature
    private String subject_key_identifier; // Subject Key Identifier
    private String authority_key_identifier; // Authority Key Identifier
    private String key_usage; // Usage of key in certificate
    private String extended_key_usage; // Extended usage of key in certificate
    private String policies; // Certificate Policies
    private String subject_alternative_names; // Subject Alternative Name
    private String issuer_alternative_names; // Issuer Alternative Name
    private String info_access; // Authority Information Access
    private String subject_info_access; // Subject Information Access
    private String policy_mappings; // Policy Mappings
    private String has_expired; // 1 if the certificate has expired, 0 otherwise
    private String basic_constraint; // Basic Constraints
    private String name_constraints; // Name Constraints
    private String policy_constraints; // Policy Constraints
    private String dump_certificate; // Set this value to '1' to dump certificate, #TODO additional=True, hidden=True
    private String timeout; // Set this value to the timeout in seconds to complete the TLS handshake (default 4s, use 0 for no timeout), #TODO additional=True, hidden=True
    private String pem; // Certificate PEM format

}
