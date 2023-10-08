/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
class Овца extends Животно{
    public Овца(String id, int тегло, String звук){
        super(id,тегло,звук);
    }
    @Override
    void ИздадиЗвук() {
        System.out.println("Zvuk na ovtsa: "+звук);
    }

    @Override
    void ПокажиИнформация() {
        String info=String.format("Ovtsa s id %s tezhi %d kg i kazva %s.", id,тегло,звук);
        System.out.println(info);
    }
    
}
