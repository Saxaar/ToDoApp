package sample.Controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.Database.DatabaseHandler;


public class SignUpController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpFirstName;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpUsername;

    @FXML
    private TextField signUpLocation;

    @FXML
    private CheckBox signUpCHeckBoxMale;

    @FXML
    private CheckBox signUpCHeckBoxFemale;

    @FXML
    private PasswordField signUpPassword;

    @FXML
    private Button signUpButton;

    @FXML
    void initialize() {
        DatabaseHandler databaseHandler =new DatabaseHandler();
        signUpButton.setOnAction(event -> {

            databaseHandler.signUpUser(signUpFirstName.getText(),signUpLastName.getText(),signUpUsername.getText(),
                    signUpPassword.getText(),signUpLocation.getText(),"Male");

        });

    }
}
