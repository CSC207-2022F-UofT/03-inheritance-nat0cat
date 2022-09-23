/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */

/**
 * CrossbodyBag is a subclass of Bag that takes an additional attribute
 * of how many straps it has.
 */
public class CrossbodyBag extends Bag{
    /** The number of straps on the Crossbody bag*/
    public int numberOfStraps;

    /**
     * A constructur that creates a new CrossbodyBag
     * with the given color and capacity.
     *
     * @param col the colour of the bag
     * @param cap the capacity of the bag
     * @param num the number of straps on the bag
     *
     */
    public CrossbodyBag(String col, int cap, int num) {
        super(col, cap);
        numberOfStraps = num;
    }

    /**
     * Returns the value of the number of straps of the CrossbodyBag.
     *
     * @return numberOfContents
     */
    public int getNumberOfStraps() {
        return numberOfStraps;
    }

    /**
     * Increases the capacity of this bag by 1.
     */
    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }

    /**
     * Return the details of this CrossbodyBag.
     *
     * @return a String describing the Bag.
     */
    @Override
    public String toString() {
        return this.getColor() + " Crossbody Bag with " + numberOfStraps + " straps (" + this.getNumberOfContents() + " / " +
                this.getCapacity() + ")";
    }
}
