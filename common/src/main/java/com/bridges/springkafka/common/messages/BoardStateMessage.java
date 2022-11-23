package com.bridges.springkafka.common.messages;

import com.bridges.springkafka.common.beans.Airport;
import com.bridges.springkafka.common.beans.Board;
import com.bridges.springkafka.common.beans.Source;
import com.bridges.springkafka.common.beans.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardStateMessage extends Message{
    private Board board;

    public BoardStateMessage() {
        this.source = Source.BOARD;
        this.type = Type.STATE;
    }

    public BoardStateMessage(Board board) {
        this();
        this.board = board;
    }
}
