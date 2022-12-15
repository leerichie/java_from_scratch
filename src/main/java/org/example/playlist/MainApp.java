package org.example.playlist;

import java.util.*;

public class MainApp {
    private static ArrayList<Album> albums = new ArrayList<>();

    private static void play(LinkedList<Song> playList) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("This playlist has no tracks");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            menuOptions();
        }
        while (!quit) {
            int action = input.nextInt();
            input.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("End of list, no tracks to display");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("This if the first track");
                        forward = false;
                    }
                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Beginning of list");
                        }
                    } else {
                        System.out.println("End of list");
                    }
                    break;

                case 4:
                    listTracks(playList);
                    break;

                case 5:
                    menuOptions();
                    break;

                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("now playing " + listIterator.previous().toString());
                        } else {
                            if(listIterator.hasPrevious()){
                                System.out.println("now playing " + listIterator.previous().toString());
                            }
                        }
                    }
            }
        }

    }

    private static void menuOptions() {
        System.out.println("Options\n press");
        System.out.println("0 - to quit\n" +
                "1 - play next track\n" +
                "2 - play previous track\n" +
                "3 - replay current track\n" +
                "4 - show all tracks\n" +
                "5 - show all options\n" +
                "6 - delete current track");
    }

    private static void listTracks(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("************************");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("************************");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String albumTitle,
                artist,
                songTitle;
//                playlist_1;
        double songDuration;

        System.out.println("Enter album title");
        albumTitle = input.nextLine();
        System.out.println("Enter artist");
        artist = input.nextLine();

        Album album = new Album(albumTitle, artist);

        System.out.println("Enter track title");
        songTitle = input.nextLine();
        System.out.println("Enter track duration");
        songDuration = input.nextDouble();

        album.addSong(songTitle, songDuration);
        albums.add(album);

        LinkedList<Song> playlist_1 = new LinkedList<>();

        albums.get(0).addToPlaylist(songTitle, playlist_1);

        play(playlist_1);
    }
}
