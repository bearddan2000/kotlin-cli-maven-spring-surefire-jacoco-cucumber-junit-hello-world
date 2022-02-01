import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;
import example.service.*

class Greet {

  lateinit var service: GreetService;

  @When("say")
  fun createGreeting() {
    this.service = GreetServiceImpl();
  }

  @Then("^greeting should be (.*)$")
  fun checkGreeting(greeting: String) {
    val res = service.say();
    Assertions.assertEquals(res, greeting);
  }
}
