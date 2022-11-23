package com.bridges.springkafka.common.messages;

import com.bridges.springkafka.common.beans.Airport;
import com.bridges.springkafka.common.beans.Source;
import com.bridges.springkafka.common.beans.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirPortStateMessage extends Message{
    private Airport airport;

    public AirPortStateMessage() {
        this.source = Source.AIRPORT;
        this.type = Type.STATE;
    }

    public AirPortStateMessage(Airport airport) {
        this();
        this.airport = airport;
    }
}
