package com.endava.extensions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;


public class MyTestExecutionListener implements TestExecutionListener {

    private static final Logger LOGGER = LogManager.getLogger(MyTestExecutionListener.class);

    public void executionStarted(TestIdentifier testIdentifier) {
        LOGGER.info("Starting test: {}", testIdentifier.getDisplayName());
    }

    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        LOGGER.info("Finishing test: {} with status: {}", testIdentifier.getDisplayName(), testExecutionResult.getStatus());
    }
}
