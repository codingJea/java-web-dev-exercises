package studios.lsn4and5restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> myBucket = new ArrayList<>();
        MenuItem basicSkillet = new MenuItem("Basic Skillet", "A skillet of potatoes, cheddar jack cheese & 2 eggs your way with English muffin.", "Entree", 10.58);
        MenuItem traditionalEggs = new MenuItem("Traditional Eggs", "2 eggs served your way, toasted English muffin with side of potatoes or citrus tossed greens", "Entree", 7.75);
        MenuItem vanChaiTea = new MenuItem("Vanilla Chai Tea", "Spiced with ginger, honey, and vanilla", "Drinks", 5.21);
        MenuItem flan = new MenuItem("Flan", "Food stuff", "Dessert", 2.34);

        myBucket.add(basicSkillet);
        myBucket.add(traditionalEggs);
        myBucket.add(vanChaiTea);
        myBucket.add(flan);

        Menu myMenu = new Menu(myBucket);

        MenuItem poutine = new MenuItem("Poutine", "Fancy fries", "Appetizer", 12.99);


//        myMenu.showAll();
//        myMenu.remove();
//        myMenu.addItem(poutine);
//        myMenu.showAll();
//        myMenu.showItem();
//        myMenu.simpleShowItem(2);
        myMenu.showLastUpdated();
    }
}
