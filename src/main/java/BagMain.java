/* This file contains a few exercises and TODOs for you to fill.
 * Make sure you do the TODOs in Bag.java, HandBag.java and CrossbodyBag.java
 * as the tasks in this file depends on the completion on those!
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
class BagMain {
    /**
     * Enhances each of the bags in bags. If double_enhance_handbags is
     * True, then it enhances any HandBags a second time.
     *
     * This method works for *all* Bags! We will test this method
     * on new Bag types (and HandBag subclasses)!
     *
     * @param bags the Bags to enhance.
     * @param double_enhance_handbags a boolean to determine if a Bag
     *                                will be double enhanced.
     */
    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {
        // iterating through the bags
        for (int x = 0; x < bags.length; x++) {
            bags[x].enhance();

            // if double_enhance_handbags is true and is a HandBag, enhance again
            if (double_enhance_handbags && (bags[x] instanceof HandBag)) {
                bags[x].enhance();
            }
        }
    }

    /**
     * Returns the total number of straps in CrossbodyBags in bags.
     * Any bag that is not a CrossbodyBag will not be included
     * in the count.
     *
     * @param bags An array of Bags
     * @return The total number of straps of CrossbodyBags.
     */
    public static int countCrossbodyStraps(Bag[] bags) {
        // initialize the value to be returned
        int sum = 0;

        // iterate through the given Bags
        for (int x = 0; x < bags.length; x++) {

            // if it is a CrossbodyBag the number of straps are added
            if (bags[x] instanceof CrossbodyBag) {
                sum += ((CrossbodyBag) bags[x]).getNumberOfStraps();
            }
        }

        // return the final count
        return sum;
    }
}