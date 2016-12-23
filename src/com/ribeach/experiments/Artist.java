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
public class Artist {
    
    private String name;
    private String origin;
    private List<String> members;
    
   /**
    * Default constructor
    */
     public Artist() {
         this.name = "Anonymous";
         this.origin = "Unknown";
     }
    
   /**
    * Construct from specified individual fields
    */
    public Artist(String name, String origin, List<String> members) {
        
        this.name = name;
        this.origin = origin;
        this.members = members;
        
    }
    
   /**
    * Construct/copy from another artist object
    */
    public Artist(Artist sourceArtist) {
        
        this.name = sourceArtist.name;
        this.origin = sourceArtist.origin;
        
        if (sourceArtist.members != null) {
            this.members = new ArrayList<>(sourceArtist.members);
        } 
    }
    
    public void setName(String name) {
        this.name = name;
    }
        
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public void setMembers(List<String> members) {
        
        if (members != null) { 
            this.members = new ArrayList<>(members);
            
        } else { 
            System.err.println("setMembers() called with a null List argument. No change made.");
        }
    }
    
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        
        sb.append("Name= " + name +", ");        
        sb.append("Origin= " + origin +", ");     
        sb.append("Members= " + members.toString());
        
        return sb.toString();
    }
    
}
