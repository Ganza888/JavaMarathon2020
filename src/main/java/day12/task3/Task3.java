package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Nirvana", 1987);
        MusicBand band2 = new MusicBand("Radiohead", 1985);
        MusicBand band3 = new MusicBand("Red Hot Chili Peppers", 1983);
        MusicBand band4 = new MusicBand("Backstreet Boys", 1993);
        MusicBand band5 = new MusicBand("Linkin Park", 1996);
        MusicBand band6 = new MusicBand("2raumwohnung", 2001);
        MusicBand band7 = new MusicBand("3 Inches of Blood", 2002);
        MusicBand band8 = new MusicBand("4 Strings", 2003);
        MusicBand band9 = new MusicBand("5'Nizza", 2004);
        MusicBand band10 = new MusicBand("12 Stones", 2005);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        groupsAfter2000(musicBands);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band: musicBands) {
            if (band.getYear() > 2000) {
                groupsAfter2000.add(band);
            }
        }
        System.out.println(groupsAfter2000);
        return groupsAfter2000;
    }
}
