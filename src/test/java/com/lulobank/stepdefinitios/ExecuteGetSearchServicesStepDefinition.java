package com.lulobank.stepdefinitios;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import static com.lulobank.exceptions.ErrorAssertion.THE_CODE_DO_NOT_MATCH;
import static com.lulobank.questions.Response.getStatus;
import static com.lulobank.tasks.PostService.addNewFavorite;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static com.lulobank.tasks.GetServiceSearch.executeGetMethodWithThe;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static com.lulobank.questions.Response.getStatusCode;


public class ExecuteGetSearchServicesStepDefinition {
  @Before
  public static void actor(){
    OnStage.setTheStage(new Cast());
    theActorCalled("Natalia");
  }
  @Before
  public static void setUpRest() {
    RestAssured.baseURI = "https://api.thecatapi.com";
    RestAssured.basePath = "v1/";
    RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    RestAssured.requestSpecification = new RequestSpecBuilder()
        .setContentType(ContentType.JSON)
        .setRelaxedHTTPSValidation()
        .build();
  }

  @Given("I make to connection to api")
  public void iMakeToConnectionToApi()
  {
    givenThat(theActorCalled("Natalia").whoCan(CallAnApi.at("/")));
  }

  @When("Execute the method GET with the resource api {string}")
  public void executeTheMethodGETWithTheResourceApi(String resourceApi) {
    when(theActorInTheSpotlight()).wasAbleTo(executeGetMethodWithThe(resourceApi));
  }
  @When("Execute the method POST with the resource api {string}")
  public void execute_the_method_post_with_the_resource_api(String resourceApi) {
    when(theActorInTheSpotlight()).wasAbleTo(addNewFavorite(resourceApi));
  }

  @Then("See that the is returned {int}")
  public void seeThatTheIsReturned(Integer statusCode) {
    assertThat(THE_CODE_DO_NOT_MATCH,
        theActorInTheSpotlight().asksFor(getStatusCode()),equalTo(statusCode)
        );
    then(theActorInTheSpotlight()).should(ResponseConsequence.seeThatResponse(
        THE_CODE_DO_NOT_MATCH,response -> response.statusCode(statusCode)
    ));
  }
  }