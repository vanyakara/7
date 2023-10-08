/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
abstract class Животно {
    String id;
    int тегло;
    String звук;
    public Животно(String id, int тегло, String звук){
        this.id=id;
        this.тегло=тегло;
        this.звук=звук;
    }
    abstract void ИздадиЗвук();
    abstract void ПокажиИнформация();
}
