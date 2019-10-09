/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td5;

import java.util.HashMap;

/**
 *
 * @author mgresse
 */
public class Basket {
    
    private HashMap<String,CommandLine> basket;
    private boolean state;
    
    public Basket(){
        this.basket=new HashMap();
        this.state=false;
    }
    
    public void addCommandLine(Reference ref, int quantity) throws BasketValidateException{
        if(this.state) throw new BasketValidateException();
        else{
            String name_new_ref=ref.getName();
            if(this.basket.containsKey(name_new_ref)){
                //this.basket.put(name_new_ref, this.basket.get(name_new_ref).addQuantity(quantity));
            }else{
                this.basket.put(name_new_ref, new CommandLine(ref,quantity));
            }
    
        }
    }
}
