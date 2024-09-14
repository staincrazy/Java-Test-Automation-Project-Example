package debug_tests;

import engine.actions.ClickActions;
import engine.actions.NavigateActions;

public class Tester

{
    public static void main(String[] args) {

        NavigateActions navigateActions = new NavigateActions();
        navigateActions.navigate("https://google.com");
    }
}
