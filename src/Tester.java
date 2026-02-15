//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;

//public class Tester extends Application {
//    @Override
//    public void start(Stage stage) {
//        Label label = new Label("Lab 1");
//
//        StackPane root = new StackPane(label);
//        Scene scene = new Scene(root, 400, 200);
//
//        stage.setTitle("SE 471");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

public class Tester {
    private static void testMode(String mode){
        System.out.println("Testing mode: "+mode);

        //gets the correct Factory?
        GameGUIFactoryIF factory = GameUtility.createGameGUIFactory(mode);

        //gets the correct character panel?
        CharacterPanel_IF characterPanel=factory.createCharacterPanel();

        //gets the correct weapon panel?
        WeaponPanel_IF weaponPanel=factory.createWeaponPanel();

        //display them
        characterPanel.display();
        weaponPanel.display();
    }

    private static void printTestBreak(){
        System.out.println("\n*** Testing Next Mode ***\n");
    }

    public static void main(String[] args) {

        testMode("beginner");
        printTestBreak();

        testMode("intermediate");
        printTestBreak();

        testMode("advanced");
    }
}


