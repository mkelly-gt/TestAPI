package com.mtt.api.test;


import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "classpath:com/mtt/api/test/steps/task/")
public class TaskControllerTest {
}
