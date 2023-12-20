package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ec2InstanceMetadata {

    public static final String TABLE = "ec2_instance_metadata";

    private String instance_id; // EC2 instance ID
    private String instance_type; // EC2 instance type
    private String architecture; // Hardware architecture of this EC2 instance
    private String region; // AWS region in which this instance launched
    private String availability_zone; // Availability zone in which this instance launched
    private String local_hostname; // Private IPv4 DNS hostname of the first interface of this instance
    private String local_ipv4; // Private IPv4 address of the first interface of this instance
    private String mac; // MAC address for the first network interface of this EC2 instance
    private String security_groups; // Comma separated list of security group names
    private String iam_arn; // If there is an IAM role associated with the instance, contains instance profile ARN
    private String ami_id; // AMI ID used to launch this EC2 instance
    private String reservation_id; // ID of the reservation
    private String account_id; // AWS account ID which owns this EC2 instance
    private String ssh_public_key; // SSH public key. Only available if supplied at instance launch time

}
