package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Processes {

    public static final String TABLE = "processes";

    private Long pid; // Process (or thread) ID , index=True
    private String name; // The process path or shorthand argv[0]
    private String path; // Path to executed binary
    private String cmdline; // Complete argv
    private String state; // Process state
    private String cwd; // Process current working directory
    private String root; // Process virtual root directory
    private Long uid; // Unsigned user ID
    private Long gid; // Unsigned group ID
    private Long euid; // Unsigned effective user ID
    private Long egid; // Unsigned effective group ID
    private Long suid; // Unsigned saved user ID
    private Long sgid; // Unsigned saved group ID
    private Long on_disk; // The process path exists yes=1, no=0, unknown=-1
    private Long wired_size; // Bytes of unpageable memory used by process
    private Long resident_size; // Bytes of private memory used by process
    private Long total_size; // Total virtual memory size", aliases=["phys_footprint"]
    private Long user_time; // CPU time in milliseconds spent in user space
    private Long system_time; // CPU time in milliseconds spent in kernel space
    private Long disk_bytes_read; // Bytes read from disk
    private Long disk_bytes_written; // Bytes written to disk
    private Long start_time; // Process start time in seconds since Epoch, in case of error -1
    private Long parent; // Process parent's PID
    private Long pgroup; // Process group
    private Long threads; // Number of threads used by process
    private Long nice; // Process nice level (-20 to 20, default 0)

    private Long elevated_token; // WINDOWS    Process uses elevated token yes=1, no=0
    private Long secure_process; // WINDOWS    Process is secure (IUM) yes=1, no=0
    private String protection_type; // WINDOWS    The protection type of the process
    private Long virtual_process; // WINDOWS    Process is virtual (e.g. System, Registry, vmmem) yes=1, no=0
    private Long elapsed_time; // WINDOWS    Elapsed time in seconds this process has been running.
    private Long handle_count; // WINDOWS    Total number of handles that the process has open. This number is the sum of the handles currently opened by each thread in the process.
    private Long percent_processor_time; // WINDOWS    Returns elapsed time that all of the threads of this process used the processor to execute instructions in 100 nanoseconds ticks.

    private Long upid; // DARWIN    A 64bit pid that is never reused. Returns -1 if we couldn't gather them from the system.
    private Long uppid; // DARWIN    The 64bit parent pid that is never reused. Returns -1 if we couldn't gather them from the system.
    private Long cpu_type; // DARWIN    Indicates the specific processor designed for installation.
    private Long cpu_subtype; // DARWIN    Indicates the specific processor on which an entry may be used.
    private Long translated; // DARWIN    Indicates whether the process is running under the Rosetta Translation Environment, yes=1, no=0, error=-1.

    private String cgroup_path; // LINUX   The full hierarchical path of the process's control group

}
