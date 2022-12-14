package com.bridges.springkafka.common.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoutePath {
    private RoutePoint from;
    private RoutePoint to;
    private double progress;

    public void addProgress(double speed) {
        progress += speed;
        if (progress > 100) {
            progress = 100;
        }
    }

    public boolean inProgress() {
        return progress < 100;
    }

    public boolean done() {
        return progress == 100;
    }
}
