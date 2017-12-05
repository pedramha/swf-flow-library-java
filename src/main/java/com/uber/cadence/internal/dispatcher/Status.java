package com.uber.cadence.internal.dispatcher;

enum Status {
    CREATED,
    RUNNING,
    YIELDED,
    EVALUATING,
    INTERRUPTED,
    FAILED,
    DONE
}
