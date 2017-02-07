/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Exercise {

    Scanner scanner = new Scanner(System.in);
    private int number;
    private int lastNumber;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try
        {
            Exercise obj = new Exercise();
            obj.run(args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }        
    }
    
    public void run (String[] args) throws Exception
    {
        System.out.println("Primer Ejercicio");          
        getInput();
    }
    
    public void getInput() {
        
        System.out.println("Ingrese el numero del cual desea la tabla");
        number = scanner.nextInt();
        
        System.out.println("Inserte hasta que numero desea que se multiplique");
        lastNumber = scanner.nextInt();
        
        showTable(number,lastNumber);
    }
    
    public void showTable(int number, int last) {
        for(int i = 0; i <= last; i++) {
            System.out.println(number + "X" + i + "=" + number * i);
        }
    }
    
}
