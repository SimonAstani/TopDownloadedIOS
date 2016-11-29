package com.example.simon.top10downloader;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by simon on 11/29/2016.
 */

public class FeedAdapter extends ArrayAdapter {
    private static final String TAG = "FeedAdapter";
    private final int layoutResource;
    private final LayoutInflater layoutInflator;
    private List<FeedEntry> songs;

    public FeedAdapter(Context context, int resource, List<FeedEntry> songs) {
        super(context, resource);
        this.layoutResource = resource; //in java this just refere to current instance of the class
        this.layoutInflator = LayoutInflater.from(context);
        this.songs = songs;
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflator.inflate(layoutResource,parent,false);
        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        TextView tvArtist = (TextView) view.findViewById(R.id.tvArtist);
        TextView tvSummary = (TextView) view.findViewById(R.id.tvSummary);
        FeedEntry currentapp = songs.get(position);

        tvName.setText(currentapp.getName());
        tvArtist.setText(currentapp.getArtist());
        tvSummary.setText(currentapp.getImageURL());
        return view;
    }
}












