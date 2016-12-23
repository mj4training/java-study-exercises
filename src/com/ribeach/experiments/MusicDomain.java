/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ribeach.experiments;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Melissa
 */
public class MusicDomain {
    
    private static List<Artist> artists;
    private static List<Album> albums;

    /**
     * @param args the command line arguments
     */
    public MusicDomain() {
        
        Artist artist;
        
        artists = new ArrayList<>();
        albums = new ArrayList<>();

        
        try {
            artist = new Artist("The Beatles", "Liverpool England",
                    new ArrayList<>(Arrays.asList("John", "Paul", "George", "Ringo")));
            
            artists.add(artist);
                    
            albums.add(new Album("Yellow Submarine",
                    new ArrayList<>(Arrays.asList(new Track("Hey Bulldog"), new Track("All Together Now"))),
                    new ArrayList<>(Arrays.asList(new Artist(artist)))));
            
            artist = new Artist("U2", "Dublin Ireland",
                    new ArrayList<>(Arrays.asList("Bono", "The Edge", "Larry", "Adam")));
            
            artists.add(artist);
            
            albums.add(new Album("Rattle and Hum",
                    new ArrayList<>(Arrays.asList(new Track("Helter Skelter"), new Track("Desire"))),
                    new ArrayList<>(Arrays.asList(new Artist(artist)))));
            
        } catch (RuntimeException e) {
            
            System.err.println("Exception when populating domain objects. Reason: " + e.getMessage());
        }
        
    } // End constructor
    
    public List<Artist> getArtists() {
        
        return artists;
    }
    
    public List<Album> getAlbums() {
        
        return albums;
    }
    
}
