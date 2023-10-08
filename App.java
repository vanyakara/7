/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        Животно прасе=new Прасе("246382",240,"Oink");
        прасе.ПокажиИнформация();
        прасе.ИздадиЗвук();
        System.out.println();
        Животно крава=new Крава("345773",200,"Muuu");
        крава.ПокажиИнформация();
        крава.ИздадиЗвук();
        System.out.println();
        Животно овца = new Овца("238479",110,"Beee");
        овца.ПокажиИнформация();
        овца.ИздадиЗвук();
        System.out.println();
        Животно коза=new Коза("428342",100,"Meee");
        коза.ПокажиИнформация();
        коза.ИздадиЗвук();
        System.out.println();
        Животно куче=new Куче("327472",45,"Gav");
        куче.ПокажиИнформация();
        куче.ИздадиЗвук();
        System.out.println();
        Животно котка=new Котка("834528",8,"Meow");
        котка.ПокажиИнформация();
        котка.ИздадиЗвук();
    }
}
