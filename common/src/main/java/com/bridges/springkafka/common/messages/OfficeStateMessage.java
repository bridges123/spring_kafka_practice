package com.bridges.springkafka.common.messages;

import com.bridges.springkafka.common.beans.Source;
import com.bridges.springkafka.common.beans.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeStateMessage extends Message {

    public OfficeStateMessage() {
        this.source = Source.OFFICE;
        this.type = Type.STATE;
    }

}
