package dev.jodat.osqueryspringboot.entity.osQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProcessMemoryMap {

    public static final String TABLE = "process_memory_map";

    private Long pid ; // Process (or thread) ID", index=True
    private String start ; // Virtual start address (hex)
    private String end ; // Virtual end address (hex)
    private String permissions ; // r=read, w=write, x=execute, p=private (cow)
    private Long offset ; // Offset into mapped path
    private String device ; // MA:MI Major/minor device ID
    private Long inode ; // Mapped path inode, 0 means uninitialized (BSS)
    private String path ; // Path to mapped file or mapped type
    private Long pseudo ; // 1 If path is a pseudo path, else 0

}
