package com.example.uuuudemo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login pertama");

        GridPane loginGrid = createLoginForm(primaryStage);
        Scene loginScene = new Scene(loginGrid, 300, 275);
        primaryStage.setScene(loginScene);

        primaryStage.show();
    }

    private GridPane createLoginForm(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Halaman Login");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String username = userTextField.getText();
                String password = pwBox.getText();
                if ("Zaky".equalsIgnoreCase(username) && "zaky12345".equals(password)) {
                    createWelcomeScene(primaryStage, username);
                } else {
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Nama atau password salah");
                }
            }
        });

        return grid;
    }

    private void createWelcomeScene(Stage primaryStage, String userName) {
        GridPane welcomeGrid = new GridPane();
        welcomeGrid.setAlignment(Pos.CENTER);
        welcomeGrid.setHgap(10);
        welcomeGrid.setVgap(10);
        welcomeGrid.setPadding(new Insets(25, 25, 25, 25));

        Text welcomeText = new Text("Halo " + userName + " selamat datang");
        welcomeText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        welcomeGrid.add(welcomeText, 0, 0, 2, 1);

        Button backBtn = new Button("Kembali");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(backBtn);
        welcomeGrid.add(hbBtn, 1, 4);

        Scene welcomeScene = new Scene(welcomeGrid, 300, 275);
        primaryStage.setScene(welcomeScene);

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                primaryStage.setScene(new Scene(createLoginForm(primaryStage), 300, 275));
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
