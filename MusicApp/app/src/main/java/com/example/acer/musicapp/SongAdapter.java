package com.example.acer.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {


    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_Name.
        TextView SongTextView = listItemView.findViewById(R.id.song_name);
        SongTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID Artist_name.
        TextView ArtistTextView = listItemView.findViewById(R.id.artist_name);
        ArtistTextView.setText(currentSong.getArtistName());

        // Find the ImageView in the list_item.xml layout with the ID song_image.
        ImageView imageView = listItemView.findViewById(R.id.song_image);
        imageView.setImageResource(currentSong.getImage());
        // Return the whole list item and show it together
        return listItemView;
    }
}