package ooad_6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author vandana
 */
abstract class Component {
    String description = "Not yet selected";
    public abstract int cost();
    public String name(){
        return description;
    }
}
