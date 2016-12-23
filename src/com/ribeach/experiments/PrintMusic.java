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
public class PrintMusic {
    
    public static void main(String[] args) {

    MusicDomain domain = new MusicDomain();
        
    System.out.println("All Albums ...");
        
    int i = 0;
        
    for (Album album : domain.getAlbums()) {
        
        System.out.println("Album[" + i + "]");
        System.out.println(album.toString());
        i++;
    }
    
    System.out.println("All Artists ...");
        
    int j = 0;
        
    for (Artist artist : domain.getArtists()) {
        
        System.out.println("Artist[" + j + "]");
        System.out.println(artist.toString());
        j++;
    }
        
    } // End main
    
}
