/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreevent;

/**
 *
 * @author PAktobchawa
 */
public class Subscriber implements scoreChange {
    @Override
    public void update(ScoreEvent Event) {
        System.out.println("live result: " + Event.getScore());
    }
}
