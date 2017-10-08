package nl.davinci.soapy.cucumber.stepdefs;

import nl.davinci.soapy.SoapyApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SoapyApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
