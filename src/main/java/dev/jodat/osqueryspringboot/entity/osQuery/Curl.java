package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curl {

    public static final String TABLE = "curl";

    private String url; // The url for the request, # TODO required=True, index=True
    private String method; // The HTTP method for the request
    private String user_agent; // The user-agent string to use for the request
    private Long response_code; // The HTTP status code for the response
    private Long round_trip_time; // Time taken to complete the request
    private Long bytes; //Number of bytes in the response
    private String result; // The HTTP response body

}
