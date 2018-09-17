/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjourjaime;

import aleatoire.Person;

/**
 *
 * @author HP USER
 */
public class BonjourJaime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person j = new Person (args[0], args[1], Integer.parseInt(args[2]));
        System.out.println("Ton prenom est: " + j.getFirstName() + " Ton nom est: "
        + j.getLastName() + " Ton age est: " + j.getAge() );
        
    }
    
}
