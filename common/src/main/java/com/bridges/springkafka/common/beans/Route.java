package com.bridges.springkafka.common.beans;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Route {
    private String boardName;
    private List<RoutePath> paths = new ArrayList<>();

    public boolean notAssigned() {
        return boardName == null;
    }
}
