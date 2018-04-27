/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_6;

/**
 *
 * @author vandana
 */
public class V12Engine extends Feature{
    Component component;
   public V12Engine(Component component) {
        this.component = component;
    }

    @Override
    public int cost() {
        return component.cost() + 6000;
    }

    public String name() {
       return component.name()+" ,V-12 Engine";
    }  
}
