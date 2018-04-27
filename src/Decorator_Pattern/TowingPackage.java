/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_6;

import ooad_6.Component;

/**
 *
 * @author vandana
 */
public class TowingPackage extends Feature {

    private Component component;
    //private Feature feature;

    public TowingPackage(Component component) {
        this.component = component;
    }

    @Override
    public int cost() {
        return component.cost() + 3000;
    }

    public String name() {
       return component.name()+" ,Towing Package";
    }

    
}
