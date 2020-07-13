package org.pipeline.demo.demo.pipeline;

import org.pipeline.demo.demo.pipeline.model.FlowResult;
import org.pipeline.demo.demo.pipeline.model.PipeLineContext;

/**
 * 管道接口
 * @author Issac Zhou
 * @date 2020/07/13
 */
public interface PipeLine {

    /**
     * 添加阀门
     *
     * @param valve 阀门
     */
    void add(Valve valve);

    /**
     * 开启管道
     *
     * @param context 上下文
     * @return flowResult
     */
    FlowResult start(PipeLineContext context);
}
