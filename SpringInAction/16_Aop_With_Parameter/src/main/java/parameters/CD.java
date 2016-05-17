package parameters;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/17/2016.
 */
public class CD {
    private String name;
    public static int MAX_TRACK_NUMBER = 12;
    private int numberOfTracks = 0;
    private Track[] tracks = new Track[MAX_TRACK_NUMBER];

    public CD(String name){
        this.name = name;
    }

    public CD(String name, Track[] tracks){
        this(name);
        this.tracks = tracks;
        this.numberOfTracks = tracks.length ;
    }

    public void addTrack(Track track){
        if(numberOfTracks < MAX_TRACK_NUMBER){
            tracks[numberOfTracks++] = track;
        }
        else {
            System.out.println("Could not add track " + track.getName());
        }
    }

    public void play(){
        for(int i = 0; i < numberOfTracks; i++){
            playTrack(i);
        }
    }

    public void playTrack(int i) {
        tracks[i].play();
    }
}
