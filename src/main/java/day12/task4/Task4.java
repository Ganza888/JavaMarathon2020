package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Mike Shinoda");
        members1.add("Chester Beninghton");
        MusicBand band1 = new MusicBand("Linkin Park", 1996,members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Kurt Cobain");
        MusicBand band2 = new MusicBand("Nirvana", 1987, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
