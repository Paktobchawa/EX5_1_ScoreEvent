/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package scoreevent;

import java.util.EventListener;

/**
 *
 * @author PAktobchawa
 */
public interface scoreChange extends EventListener {
    public void update(ScoreEvent Event);
}
