package org.pipeline.demo.demo.pipeline;

import org.pipeline.demo.demo.pipeline.model.FlowResult;
import org.pipeline.demo.demo.pipeline.model.PipeLineContext;

/**
 * 阀门接口
 *
 * @author Issac Zhou
 * @date 2020/07/13
 */
public interface Valve {

    /**
     * 获取下一个阀门
     *
     * @return 阀门
     */
    Valve getNext();

    /**
     * 设置下一个阀门
     *
     * @param valve 阀门
     */
    void setNext(Valve valve);

    /**
     * 执行管道
     *
     * @param context 上下文
     * @return flowResult
     */
    FlowResult invoke(PipeLineContext context);

}
