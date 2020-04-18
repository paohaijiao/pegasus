package com.pegasus.toolkit;
import lombok.Data;
import java.util.List;

/**
 * @program: kettle-Executor
 * @description: ${description}
 * @author: Gou Ding Cheng
 * @create: 2019-09-24 09:45
 **/
@Data
public class PreviewBean {
    private  List<Object[]> rowBuffer;
    private List<ValueMetaInterface> rowBufferMeta;
}