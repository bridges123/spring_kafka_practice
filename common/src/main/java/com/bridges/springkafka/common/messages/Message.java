package com.bridges.springkafka.common.messages;

import com.bridges.springkafka.common.beans.Source;
import com.bridges.springkafka.common.beans.Type;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Message {
    protected Type type;
    protected Source source;

    public String getCode() {
        return source.name() + '_' + type.name();
    }
}
