package com.qdk.app_quizz;

import com.qdk.utils.MyAlertSingleton;
import com.qdk.utils.theme.DarkFactory;
import com.qdk.utils.theme.DefaultFactory;
import com.qdk.utils.theme.LightFactory;
import com.qdk.utils.theme.ThemManager;
import com.qdk.utils.theme.ThemeTypes;
import static com.qdk.utils.theme.ThemeTypes.Dark;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;


public class PrimaryController  implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void  initialize(URL url, ResourceBundle rb){
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    public void Capdo (ActionEvent e){
        MyAlertSingleton.getIntance().showMsg("Chon cap do");
    }
    
    public void HocTuMoi (ActionEvent e){
        MyAlertSingleton.getIntance().showMsg("Chon so tu");

    }
      public void LuyenThi (ActionEvent e){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("QuizApp");
        alert.setHeaderText("Hãy lựa chọn cấp độ");
        alert.setContentText("Coming soom....");
        alert.show();
    }
    
      public void changeTheme (ActionEvent e){
          this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
        }
    
}
