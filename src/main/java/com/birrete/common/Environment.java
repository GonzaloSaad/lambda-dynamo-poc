package com.birrete.common;

import java.util.Optional;

public class Environment {
    public static String getRegion() {
        Optional<String> awsRegion = Optional.ofNullable(System.getenv("AWS_REGION"));
        return awsRegion.orElseThrow(IllegalStateException::new);
    }
}
