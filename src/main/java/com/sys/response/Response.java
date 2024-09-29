package com.sys.response;

import java.time.LocalDateTime;

public record Response(String message,Object data,LocalDateTime time) {
    
    public Response(String message,Object data){      
        this(message,data,LocalDateTime.now());
    }
}
