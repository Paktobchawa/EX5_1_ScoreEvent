/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreevent;

import java.util.Scanner;

/**
 *
 * @author PAktobchawa
 */
public class Display {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        ScoreSoure soure = new ScoreSoure();
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        
        soure.addSubscriber(s1);
        soure.addSubscriber(s2);
        
        String enterKey = "";
        String score ;
        Boolean finish = false;
        
        while (!finish) {
            System.out.print("Enter score: ");
            score = sc.nextLine();
            if (!(score.equals(enterKey))) {
                soure.setScoreLine(score);
            } else {
                finish = true;
            }
        }
    }
}
