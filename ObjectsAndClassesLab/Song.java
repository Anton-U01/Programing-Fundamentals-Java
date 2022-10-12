package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
    String typeList;
    String name;
    String time;

    Song(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    String getType() {
        return typeList;
    }

    String getInfo() {
        return this.name;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] data = input.split("_");
            String type = data[0];
            String name = data[1];
            String time = data[2];
            songs.add(new Song(type, name, time));
        }
        String searchedType = scan.nextLine();
        for (Song song : songs) {
            if (song.getType().equals(searchedType)) {
                System.out.println(song.getInfo());
            } else if (searchedType.equals("all")) {
                System.out.println(song.getInfo());
            }
        }
    }
}