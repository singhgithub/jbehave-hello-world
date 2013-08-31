package my.apps.calculator;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculationSteps extends Steps {

    private Calculator calculator;

    private int result;

    @Given("the system is ready")
    public void theSystemIsReady() {
        this.calculator = new Calculator();
    }

    @When("I sum  $var1 and $var2")
    public void iSumVar1AndVar2(int var1, int var2) {
        result = calculator.sum(var1, var2);
    }

    @Then("the result should equal to $value")
    public void thenTheResultShouldEqualToTheValue(int value) {
        assertThat(result, is(value));
    }
}
