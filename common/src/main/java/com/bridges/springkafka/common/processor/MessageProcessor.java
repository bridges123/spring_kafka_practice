package com.bridges.springkafka.common.processor;

import com.bridges.springkafka.common.messages.Message;

public interface MessageProcessor<T extends Message> {
    void process(String jsonMessage);
}
