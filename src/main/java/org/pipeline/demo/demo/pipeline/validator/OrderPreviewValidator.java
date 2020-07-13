package org.pipeline.demo.demo.pipeline.validator;

import org.pipeline.demo.demo.pipeline.NormalValve;
import org.pipeline.demo.demo.pipeline.model.FlowResult;
import org.pipeline.demo.demo.pipeline.model.PipeLineContext;

/**
 * @author Issac Zhou
 * @date 2020/07/13
 */
public class OrderPreviewValidator extends NormalValve {

    @Override
    public FlowResult invoke(PipeLineContext context) {
        Object xx = context.get("xx");
        if (xx == null) {
            return FlowResult.fail("ff");
        }
        return processContinue(context);
    }
}
