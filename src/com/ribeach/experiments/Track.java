/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ribeach.experiments;

/**
 *
 * @author Melissa
 */
public class Track {
    
    private String track;
    
    public Track(String track) {
        
        this.track = track;
    }
    
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        
        sb.append("Track= " + track);
        
        return sb.toString();
    }
}
