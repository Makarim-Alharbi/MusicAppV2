package com.example.acer.musicapp;

public class Song {
    //Song name for the Song.
    private String mSongName;
    //Artist name for the Song.
    private String mArtistName;
    //Image for the Song.
    private int mImage;
    //Audio for the Song.
    private int mAudio;

    /* Create a new Song object that take four parameters.
     * @param songName it take Song Name and show it to the user.
     * @param artistName it take Artist Name and show it to the user.
     * @param image it take Song album and show it to the user.
     * @param Audio it take Song and play it to the user when Click.
     */
    public Song(String songName, String artistName, int image, int audio) {
        mSongName = songName;
        mArtistName = artistName;
        mImage = image;
        mAudio = audio;
    }
    // get songName of the song and return it to the user.
    public String getSongName() {
        return mSongName;
    }
    // get artistName of the song and return it to the user.
    public String getArtistName() {
        return mArtistName;
    }
    // get image of the song and return it to the user.
    public int getImage() {
        return mImage;
    }
    // get Audio of the song and return it to the user.
    public int getAudio() {
        return mAudio;
    }
}


