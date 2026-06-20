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
public enum ThemeTypes {
    Default {
        @Override
        public void updateTheme(Scene scene) {
                ThemManager.setTheme(new DefaultFactory());
                ThemManager.applyTheme(scene);        }
    }, Dark {
        @Override
        public void updateTheme(Scene scene) {
            ThemManager.setTheme(new DarkFactory());
            ThemManager.applyTheme(scene);        }
    }, Light {
        @Override
        public void updateTheme(Scene scene) {
                ThemManager.setTheme(new LightFactory());
                ThemManager.applyTheme(scene);        }
    };
    public abstract void updateTheme (Scene scene );
}
