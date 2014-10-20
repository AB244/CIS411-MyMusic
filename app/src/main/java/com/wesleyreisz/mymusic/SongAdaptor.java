package com.wesleyreisz.mymusic;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.wesleyreisz.mymusic.model.Song;

import java.util.List;

/**
 * Created by Alex on 10/20/2014.
 */
public class SongAdaptor extends ArrayAdapter<Song>{
    private Context songContext;
    private List<Song> listSongEntries;
    public SongAdaptor(Context context, int textViewResourceId, List<Song> songEntries) {
        super(context, textViewResourceId, songEntries);
        songContext = context;
        listSongEntries = songEntries;
    }
}
