package org.pipeline.demo.demo.pipeline.model;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Issac Zhou
 * @date 2020/07/13
 */
@Builder
@Getter
public class FlowResult {

    private String msg;

    private Integer code;

    public FlowResult(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public static FlowResult ok() {
        return ok(null);
    }

    public static FlowResult ok(String message) {
        return FlowResult.builder()
                .code(0)
                .msg(message)
                .build();
    }

    public static FlowResult fail(String message) {
        return FlowResult.builder()
                .code(-1)
                .msg(message)
                .build();
    }
}
