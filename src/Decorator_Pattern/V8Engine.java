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
public class V8Engine extends Feature{
    Component component;
   public V8Engine(Component component) {
        this.component = component;
    }

    @Override
    public int cost() {
        return component.cost() + 4000 ;
    }

    public String name() {
       return component.name()+" ,V-8 Engine";
    }  
}
