package com.packtpub.mastering.selenium;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

/**
 * Created by Ripon on 11/6/2015.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"})

public class RunCukesTest {
}