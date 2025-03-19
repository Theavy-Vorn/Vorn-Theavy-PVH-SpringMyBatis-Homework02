package org.example.springmybatishomework02.model.dto.respone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Builder : replace : repone.setMessage("get success")

public class ApiRespone <T>{
    private Boolean success;
    private String message;
    private HttpStatus status;
    private T payload;
    private LocalDateTime timestamp;
}
