package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (Item it : items) {
            Item item = it;
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        int size = 0;
        Item[] rsl = new Item[items.length];
        for (Item it : items) {
            Item name = it;
            if (name != null) {
                rsl[size++] = name;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] foundItems = new Item[items.length];
        int counter = 0;
        for (Item it : items) {
            if (it != null && key.equals(it.getName())) {
                foundItems[counter++] = it;
            }
        }
        return Arrays.copyOf(foundItems, counter);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item it) {
        int index = indexOf(id);
        String replac = it.getName();
        boolean x = false;
        if (index != -1) {
            items[id - 1].setName(replac);
            x = false;
        }
        return x;
    }
}