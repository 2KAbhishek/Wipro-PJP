package com.tm2.bean;

public class VideoStore {
    private Video[] store;

    public int getStoreSize() {
        if (store != null) return store.length;
        else return 0;
    }

    public Video getLastAdded() {
        if (store != null) return store[store.length - 1];
        else return null;
    }

    public void addVideo(String name) {
        Video video = new Video(name);
        int storeSize;

        try {
            storeSize = store.length;
        } catch (Exception e) {
            storeSize = 0;
        }

        Video[] newStore = new Video[storeSize + 1];
        newStore[storeSize] = video;
        store = newStore;
    }

    public void doCheckout(String name) {
        if (store == null || store.length == 0) {
            System.out.println("Store is empty");
            return;
        }

        for (Video video : store) {
            if (video.getName().equals(name)) {
                video.doCheckout();
            }
        }
    }

    public void doReturn(String name) {
        if (store == null || store.length == 0) {
            System.out.println("Store is empty");
            return;
        }

        for (Video video : store) {
            if (video.getName().equals(name)) {
                video.doReturn();
            }
        }
    }

    public void receiveRating(String name, int rating) {
        if (store == null || store.length == 0) {
            System.out.println("Store is empty");
            return;
        }

        for (Video video : store) {
            if (video.getName().equals(name)) {
                video.receiveRating(rating);
            }
        }
    }

    public void listInventory() {
        if (store == null || store.length == 0) {
            System.out.println("Store is empty");
            return;
        }

        for (int i = 0; i < 80; i++) System.out.print("-");
        System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", "Name", "Rating", "Checkout");
        for (int i = 0; i < 80; i++) System.out.print("-");

        for (Video video : store) {
            System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", video.getName(), video.getRating(), video.getCheckout());
        }

        for (int i = 0; i < 80; i++) System.out.print("-");
    }
}
