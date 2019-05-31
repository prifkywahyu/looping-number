/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberlooping;

/**
 *
 * @author user
 */
public class NumberLooping {

    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
            
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("foobar");
            }
            else if (i%5 == 0) {
                System.out.println("bar");
            }
            else if (i%3 == 0) {
                System.out.println("foo");
            }
            else System.out.println(i);
        }
    }
}
