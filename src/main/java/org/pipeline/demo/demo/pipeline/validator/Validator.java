package org.pipeline.demo.demo.pipeline.validator;

import org.pipeline.demo.demo.pipeline.NormalValve;
import org.pipeline.demo.demo.pipeline.model.FlowResult;
import org.pipeline.demo.demo.pipeline.model.PipeLineContext;

/**
 * @author Issac Zhou
 * @date 2020/07/13
 */
public class Validator extends NormalValve {

    @Override
    public FlowResult invoke(PipeLineContext context) {
        Object index = context.get("index");
        if (index == null) {
            return FlowResult.fail("x");
        }
        return processContinue(context);
    }
}
