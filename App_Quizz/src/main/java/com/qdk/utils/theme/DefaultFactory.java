/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qdk.utils.theme;

import com.qdk.app_quizz.App;

/**
 *
 * @author admin
 */
public class DefaultFactory extends ThemAbtractFactory{

    @Override
    public String getStyleSheet() {
       return App.class.getResource("styles.css").toExternalForm();
    }
    
}
