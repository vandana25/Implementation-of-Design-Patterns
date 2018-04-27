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
public class SpareTire extends Feature{
    Component component;
     public SpareTire(Component component) {
        this.component = component;
    }
   
    public String name() {
       return component.name()+" ,Spare Tire";
         }

   
    public int cost() {
        return component.cost()+400;
       }
    
}
