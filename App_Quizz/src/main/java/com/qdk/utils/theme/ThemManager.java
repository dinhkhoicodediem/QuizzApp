/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qdk.utils.theme;

import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public class ThemManager {
    private static ThemAbtractFactory theme = new DefaultFactory();

    /**
     * @param aTheme the theme to set
     */
    public static void setTheme(ThemAbtractFactory aTheme) {
        theme = aTheme;
    }
    
    public static  void applyTheme(Scene scene ){
        scene.getRoot().getStylesheets().clear();
        scene.getRoot().getStylesheets().add(theme.getStyleSheet());
    }
}
