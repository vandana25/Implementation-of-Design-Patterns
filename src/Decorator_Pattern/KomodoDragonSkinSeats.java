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
public class KomodoDragonSkinSeats extends Feature{
    Component component;
   public KomodoDragonSkinSeats(Component component) {
        this.component = component;
    }

    @Override
    public int cost() {
        return component.cost() + 12000;
    }

    public String name() {
       return component.name()+" ,Komodo Dragon Skin Seats";
    }  
}
