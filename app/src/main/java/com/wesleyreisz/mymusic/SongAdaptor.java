package com.wesleyreisz.mymusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.wesleyreisz.mymusic.model.Song;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by Alex on 10/20/2014.
 */
public class SongAdaptor extends ArrayAdapter<Song>{
    private Context songContext;
    private List<Song> listSongEntries;
    private SimpleDateFormat df = new SimpleDateFormat("MMM, d, yyyy, (EEE)");

    public SongAdaptor(Context context, int textViewResourceId, List<Song> songEntries) {
        super(context, textViewResourceId, songEntries);
        songContext = context;
        listSongEntries = songEntries;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null)
        {
            LayoutInflater inflater = (LayoutInflater) songContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listviewforeachsong,parent,false);

            final Song song = listSongEntries.get(position);

            TextView textViewTitle = (TextView)view.findViewById(R.id.textViewSongTitle);
            textViewTitle.setText(song.getSongTitle());

            TextView textViewArtist = (TextView)view.findViewById(R.id.textViewSongArtist);
            textViewTitle.setText(song.getArtistName());

            TextView textViewPubDate = (TextView)view.findViewById(R.id.textViewSongDate);
            textViewTitle.setText(df.format(song.getSongPublishedDate()));

        }
        return view;
    }
}
