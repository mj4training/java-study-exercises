/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ribeach.experiments;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Melissa
 */
public class Album {
    
    private String name;
    private List<Track> tracks;
    private List<Artist> musicians;
    
   /**
    * Default constructor
    */
    public Album() {
        
        this.name = "Unknown";
    }
    
    /**
    * Construct from specified individual fields
    */
    public Album(String name, List<Track> tracks, List<Artist> musicians) {
        
        this.name = name;
        
        if (tracks != null) {
            this.tracks = new ArrayList<>(tracks);
        }
        if (musicians != null) {
            this.musicians = new ArrayList<>(musicians);
        }
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTracks(List<Track> tracks) {
        
        if (tracks != null) { 
            this.tracks = new ArrayList<>(tracks);
            
        } else { 
            System.err.println("setTracks() called with a null List argument. No change made.");
        }
    }
     
    public void setMusicians(List<Artist> musicians) {
        
        if (musicians != null) { 
            this.musicians = new ArrayList<>(musicians);
            
        } else {
            System.err.println("setMusicians() called with a null List argument. No change made.");
        }
    }
    
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        
        sb.append("Name= " + name + "\n");         
        sb.append("Tracks= " + tracks.toString() + "\n");
        sb.append("Musicians= " + musicians.toString() + "\n");
        
        return sb.toString();
        
    }
}
