package org.pipeline.demo.demo.pipeline;

import org.pipeline.demo.demo.pipeline.model.FlowResult;
import org.pipeline.demo.demo.pipeline.model.PipeLineContext;

/**
 * @author Issac Zhou
 * @date 2020/07/13
 */
public class NormalPipeLine implements PipeLine {

    private Valve head = null;
    private Valve next = null;

    @Override
    public void add(Valve valve) {
        if (head == null) {
            head = valve;
            valve.setNext(next);
        } else {
            Valve current = head;
            while (current != null) {
                if (current.getNext() == next) {
                    current.setNext(valve);
                    valve.setNext(next);
                    break;
                }
                current = current.getNext();
            }
        }

    }

    @Override
    public FlowResult start(PipeLineContext context) {
        if (context == null) {
            return  FlowResult.fail("PipeLineContext should be not null!");
        }
        if (head == null) {
            return  FlowResult.fail("There's no valve in current pipeLine!");
        }
        return head.invoke(context);
    }
}
