/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalsystem1;

/**
 *
 * @author Hp
 */
public class RentalSystem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Customer instance = new Customer("Jose");
        System.out.println(instance.statement());
    }
    
}
