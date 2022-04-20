package com.endava.extensions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

public class MyTestExecutionListener implements TestExecutionListener {

    private static final Logger LOGGER = LogManager.getLogger(MyTestExecutionListener.class);

    public void beforeTestClass(TestContext testContext) throws Exception {
        LOGGER.info("Before Test Class : {}", testContext.getTestClass());
    }

    public void prepareTestInstance(TestContext testContext) throws Exception {
        LOGGER.info("Prepare Test Instance : {}", testContext.getTestClass());
    }

    public void beforeTestMethod(TestContext testContext) throws Exception {
        LOGGER.info("Before Test Method : {}", testContext.getTestClass());
    }

    public void afterTestMethod(TestContext testContext) throws Exception {
        LOGGER.info("After Test Method : {}", testContext.getTestClass());
    }

    public void afterTestClass(TestContext testContext) throws Exception {
        LOGGER.info("After Test Class : {}", testContext.getTestClass());
    }
}
