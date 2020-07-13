package org.pipeline.demo.demo.pipeline;

import com.alibaba.fastjson.JSON;
import org.pipeline.demo.demo.pipeline.model.FlowResult;
import org.pipeline.demo.demo.pipeline.model.PipeLineContext;
import org.pipeline.demo.demo.pipeline.validator.OrderPreviewValidator;
import org.pipeline.demo.demo.pipeline.validator.Validator;

/**
 * @author Issac Zhou
 * @date 2020/07/13
 */
public class Test {

    public static void main(String[] args) {
        PipeLineContext context = new PipeLineContext(0);
        context.put("index", 0);

        NormalPipeLine pipeLine = new NormalPipeLine();
        pipeLine.add(new Validator());
        pipeLine.add(new OrderPreviewValidator());
        FlowResult result = pipeLine.start(context);
        System.out.println(JSON.toJSONString(result));
    }
}
