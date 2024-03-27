/*
 * 
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.song.model;

import javax.persistence.*;

@Entity
@Table(name = "playlist")
public class Song {

    @Id
    @Column(name = "songid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int songId;

    @Column(name = "songname")
    private String songName;

    @Column(name = "lyricist")
    private String lyricist;

    @Column(name = "singer")
    private String singer;

    @Column(name = "musicdirector")
    private String musicDirector;

    public Song() {
    }

    public Song(int songId, String songName, String lyricist, String singer, String musicDirector) {
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    // Get and Set Method for songId
    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getSongId() {
        return this.songId;
    }

    // Get and Set Method of songName
    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return this.songName;
    }

    // Get and Set method of lyricist
    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    public String getLyricist() {
        return this.lyricist;
    }

    // Get and Set Method of singer
    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSinger() {
        return this.singer;
    }

    // Get and Set Method of musicDirector
    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }

    public String getMusicDirector() {
        return this.musicDirector;
    }

}

