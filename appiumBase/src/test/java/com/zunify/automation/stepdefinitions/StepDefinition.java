package com.zunify.automation.stepdefinitions;

import com.demo.utility.Hook;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinition {
    private static WebDriver driver;

public StepDefinition (){
    this.driver = Hook.getDriver();
}

    @Given("^precondiciones del test$")
    public void precondicionesDelTest() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^acciones del test$")
    public void accionesDelTest() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^resultado del test$")
    public void resultadoDelTest() {

    }
}
