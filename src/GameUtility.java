// Utility class to create factories based on the model type
public class GameUtility {

    //Static method to create a factory based on the model string
    public static GameGUIFactoryIF createGameGUIFactory(String mode) {
        //Checks if mode is "Beginner"
        if(mode.equalsIgnoreCase("Beginner")){
            return new BeginnerGUIFactory(); //return a factory for beginner
        }
        //Checks if mode is "Intermediate"
        else if (mode.equalsIgnoreCase("Intermediate")) {
            return new IntermediateGUIFactory(); //return a factory for intermediate
        }
        //Checks if mode is "Advanced"
        else if (mode.equalsIgnoreCase("Advanced")) {
            return new AdvancedGUIFactory(); //return a factory for advanced

        }
        //Throw an exception if the mode is unknown
        throw new IllegalArgumentException("Unknown mode: "+ mode);
    }
}
