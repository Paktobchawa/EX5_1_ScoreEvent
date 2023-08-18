/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreevent;

import java.util.ArrayList;

/**
 *
 * @author PAktobchawa
 */
public class ScoreSoure {
    ArrayList<scoreChange> scores;
    public ScoreSoure() {
        scores = new ArrayList<>();
    }
    
    public void setScoreLine(String value) {
        fireHeadQuaterEvent(new ScoreEvent(this, value));
    }
    
    public void addSubscriber(scoreChange sc) {
        scores.add(sc);
    }

    public void fireHeadQuaterEvent(ScoreEvent evt) {
        for(scoreChange s:scores) {
            s.update(evt);
        }
    }
    
}
