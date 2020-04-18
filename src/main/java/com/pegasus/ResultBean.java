package com.pegasus;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * @program: kettle-Executor
 * @description: ${description}
 * @author: Gou Ding Cheng
 * @create: 2019-09-23 14:15
 **/
@Data
@JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
public class ResultBean {
    private Integer code;
    private String message;
    private Object data;
}