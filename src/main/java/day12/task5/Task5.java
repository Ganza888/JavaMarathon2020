package day12.task5;



import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Mike Shinoda",30));
        members1.add(new MusicArtist("Chester Beninghton", 29));
        MusicBand band1 = new MusicBand("Linkin Park", 1996, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Kurt Cobain", 25));
        MusicBand band2 = new MusicBand("Nirvana", 1987, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
