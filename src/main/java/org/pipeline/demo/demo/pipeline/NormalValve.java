package org.pipeline.demo.demo.pipeline;

import org.pipeline.demo.demo.pipeline.model.FlowResult;
import org.pipeline.demo.demo.pipeline.model.PipeLineContext;

/**
 * @author Issac Zhou
 * @date 2020/07/13
 */
public class NormalValve implements Valve{

    protected Valve next = null;

    @Override
    public Valve getNext() {
        return next;
    }

    @Override
    public void setNext(Valve valve) {
        this.next = valve;
    }

    @Override
    public FlowResult invoke(PipeLineContext context) {
        return processContinue(context);
    }

    protected FlowResult processContinue(PipeLineContext pipeLineContext) {
        return next == null ? FlowResult.ok() : getNext().invoke(pipeLineContext);
    }
}
