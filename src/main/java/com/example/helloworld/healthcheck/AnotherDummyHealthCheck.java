package com.example.helloworld.healthcheck;

import com.codahale.metrics.health.HealthCheck;

public class AnotherDummyHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        if (Math.random() > 0.1) {
            return Result.healthy();
        } else {
            return Result.unhealthy("sorry!");
        }
    }
}
