/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qdk.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlertSingleton {
    private static MyAlertSingleton intance ;
    private final Alert alert ;
    
    private MyAlertSingleton (){
        this.alert = new Alert(Alert.AlertType.INFORMATION);
        this.alert.setTitle("QuizApp");
        this.alert.setHeaderText("Thong bao");
    }
    public static MyAlertSingleton getIntance(){
        if (intance == null)
            intance = new MyAlertSingleton();
        return intance;
    }
    
    public void showMsg (String content){
        this.alert.setContentText(content);
        this.alert.show();
        
    }
}
