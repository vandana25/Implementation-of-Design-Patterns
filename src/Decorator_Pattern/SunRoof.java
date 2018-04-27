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
public class SunRoof extends Feature {

    Component component;
    String model=null;

    public SunRoof(Component component, String model) {
        this.component = component;
        this.model=model;
    }

    public String name() {
        System.out.println(component.name() + "sun");
        return component.name() + " ,Sun Roof";
    }

    public int cost() {
        if(model.equals("C"))
        return component.cost() + 1900;
        else if (model.equals("CS"))
             return component.cost() + 3000;
        else 
            return component.cost() + 2200;
    }
    public void setModel(String s){
        model=s;
    }
}
