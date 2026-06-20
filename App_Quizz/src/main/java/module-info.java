module com.qdk.app_quizz {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.qdk.app_quizz to javafx.fxml;
    exports com.qdk.app_quizz;
}
