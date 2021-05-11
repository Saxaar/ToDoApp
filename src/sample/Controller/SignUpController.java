package sample.Controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.Database.DatabaseHandler;
import sample.model.User;


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

        signUpButton.setOnAction(event -> {
            createUser();
        });

    }
    private void createUser(){
        DatabaseHandler databaseHandler =new DatabaseHandler();

        String name = signUpFirstName.getText();
        String lastName = signUpLastName.getText();
        String userName = signUpUsername.getText();
        String password = signUpPassword.getText();
        String location = signUpLocation.getText();

        String gender = "";
        if (signUpCHeckBoxFemale.isSelected()){
            gender = "Female";

        } else gender = "Male";

        User user = new User(name,lastName,userName,password,location,gender);

        databaseHandler.signUpUser(user);
    }
}
