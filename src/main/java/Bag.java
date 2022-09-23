/**
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /** String representing the colour of the bag. */
    private String color;

    /** Integer representing the number of items in the bag. */
    private int numberOfContents;

    /** Integer representing the capacity of the bag. */
    private int capacity;

    /** List of Strings representing the items in the bag. */
    private String[] contents;


    /**
     * A constructor for Bag that creates a new Bag
     * with the given color and capacity.
     *
     * @param col the colour of the Bag
     * @param cap the capacity of the Bag
     */
    public Bag(String col, int cap) {
        color = col;
        capacity = cap;
        numberOfContents = 0;
        contents = new String[cap];
    }


    /**
     * Returns the value of the colour of the bag.
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Returns the value of the number of items in the bag.
     *
     * @return numberOfContents
     */
    public int getNumberOfContents() {
        return numberOfContents;
    }

    /**
     * Returns the capacity of the bag.
     *
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }


    /**
     * Updates the colour of the bag.
     *
     * @param col the new colour of the bag
     */
    public void setColor(String col) {
        color = col;
    }


    /**
     * Takes in a String representing an item in the Bag.
     * The item is added into the Bag if the number of items
     * in the bag is < the capacity of the Bag.
     * numberOfContents is modified accordingly.
     *
     * @param item the item to be added to the Bag
     * @return true if the item was added, false otherwise.
     */
    public boolean addItem(String item) {
        // determines if the number of contents is less than the capacity
        if (numberOfContents < capacity) {
            contents[numberOfContents] = item; // add the item
            numberOfContents++; // increase the number of contents
            return true;
        }

        // returns false if there is no space in the Bag
        return false;
    }


    /**
     * Returns the last item added to this Bag
     * and the item is removed from this Bag.
     * numberOfContents is modified accordingly.
     * If there are no items in this Bag, return null.
     *
     * @return null or the last item in the bag
     */
    public String popItem() {
        // initializes the value to returns
        String item = null;

        // check if the bag is not empty
        if (numberOfContents != 0) {
            item = contents[numberOfContents - 1]; // updating the items
            contents[numberOfContents - 1] = null; // removing the value from the Bag
            numberOfContents--; // updating how many contents are in the Bag
        }
        return item;
    }


    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        capacity += n;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return a String describing the Bag.
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}