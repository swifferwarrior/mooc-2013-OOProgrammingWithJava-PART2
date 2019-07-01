/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Comparator;

public class SortAgainstPoints implements Comparator<SkiJumper>{
    public int compare (SkiJumper jumper1, SkiJumper jumper2) {
        return jumper1.getTotalPoints() - jumper2.getTotalPoints();
    }
    
}

