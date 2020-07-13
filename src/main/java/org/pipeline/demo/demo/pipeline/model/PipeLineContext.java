package org.pipeline.demo.demo.pipeline.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文
 * @author Issac Zhou
 * @date 2020/07/13
 */
public class PipeLineContext {

    private PipeLineContext() {
    }

    public PipeLineContext(int size) {
        this.index = 0;
        this.context = new HashMap<>(size);
    }

    @Getter
    private int index;

    @Getter
    private Map<String,Object> context;

    public void put(String key, Object value) {
        context.put(key, value);
    }

    public Object get(String key) {
        return context.get(key);
    }

    @JSONField(serialize = false)
    public int getAndIncrement() {
        this.index++;
        return index;
    }
    @Override
    public String toString() {
        return "{\"index\":\"" + index + "\", \"context\":\"" + JSON.toJSONString(context) + "\"}";
    }

}
