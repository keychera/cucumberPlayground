package self.chera.main;

import io.cucumber.java.en.Then;

public class Commons {
    @Then("this step will be reached")
    public void thisStepWillBeReached() {
        System.out.println("Hey, we arrived here!");
    }
}
