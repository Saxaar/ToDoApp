package sample.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private TextField loginUsername;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Button loginButton;

    @FXML
    void initialize() {
        String loginText = loginUsername.getText().trim();
        String loginPwd = loginPassword.getText().trim();

        loginButton.setOnAction(event -> {

        });


        loginSignUpButton.setOnAction(event ->{
            //Перенесем Юзера в окно регистрации
            loginSignUpButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/signup.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } );

        loginButton.setOnAction(event -> {
           //Проверяем чтобы поля не были пустыми
            if (!loginText.equals("") || !loginPwd.equals("")) {
                loginUser(loginText, loginPwd);
            } else {
                System.out.println("Error login in user");
            }
        });

    }

    private void loginUser(String userName, String password) {
        // Сверяем введенные данные с БД
        if (!userName.equals("") || !password.equals("")) {

        }else {
            //надо хаполнить поля
        };
    }
}
