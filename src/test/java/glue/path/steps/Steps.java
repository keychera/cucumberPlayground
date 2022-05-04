package glue.path.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Steps {
    @Given("^this step use glue One$")
    public void thisStepUseGlueOne() {
        System.err.println("Step One");
    }

    @And("this step use glue Two")
    public void thisStepUseGlueTwo() {
        System.err.println("Step Two");
    }
}
