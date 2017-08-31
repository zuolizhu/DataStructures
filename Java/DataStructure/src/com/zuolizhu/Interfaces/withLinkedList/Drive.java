package com.zuolizhu.Interfaces.withLinkedList;

import java.util.*;

public class Drive {

    private static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Made in the A.M.", "One Direction");
        album.addSong("Hey Angle", 4.00);
        album.addSong("Drag Me Down", 3.12);
        album.addSong("Perfect", 3.50);
        album.addSong("Infinity", 4.09);
        album.addSong("End of the Day", 3.15);
        album.addSong("If I Could Fly", 3.50);
        album.addSong("Long Way Down", 3.12);
        album.addSong("Never Enough", 3.33);
        album.addSong("Olivia", 2.58);
        albums.add(album);

        album = new Album("V(Deluxe)","Maroon 5");
        album.addSong("Maps", 3.09);
        album.addSong("Animal", 3.51);
        album.addSong("It Was Always You", 3.09);
        album.addSong("Unkiss Me", 3.58);
        album.addSong("Sugar", 3.55);
        album.addSong("Leaving California", 3.23);
        album.addSong("In Your Pocket", 3.39);
        album.addSong("New Love", 3.16);
        album.addSong("Coming Back For You", 3.47);
        album.addSong("Feelings", 3.14);
        albums.add(album);

        List<Song> playlist = new ArrayList<>();
        albums.get(0).addToPlayList("Perfect", playlist);
        albums.get(0).addToPlayList("Drag Me Down", playlist);
        albums.get(0).addToPlayList("Hey Angle", playlist);
        albums.get(0).addToPlayList(7, playlist);

        albums.get(1).addToPlayList(5, playlist);
        albums.get(1).addToPlayList(2, playlist);
        albums.get(1).addToPlayList(3, playlist);
        /**
         * This below should be error
         */
        albums.get(1).addToPlayList(15, playlist);

        play(playlist);
    }

    private static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in this playlist");
            return;
        } else {
            System.out.println("Now playing --> " + listIterator.next().toString());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing --> " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing --> " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the begin of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying --> " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the begin of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying --> " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printlist(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing" + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    /**
     * How to use iterator
     * @param playlist
     */
    private static void printlist(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("_________________________________");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("_________________________________");
    }

    private static void printMenu() {
        System.out.println("Select action: \n");
        System.out.println("0 - to quit\n"+
        "1 - play next song\n" +
        "2 - play previous song\n" +
        "3 - replay current song\n" +
        "4 - show song list\n" +
        "5 - show menu\n" +
        "6 - delete current song");
    }

}
