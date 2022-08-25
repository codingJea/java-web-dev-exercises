package classexamples.ch3;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> assignments = new ArrayList<>();
        assignments.add("Mars Rover (yuck)");
        assignments.add("Launch Checklist Form");
        assignments.add("Techjobs Console");

        // initializing & filling ArrayList at the same time
        ArrayList<String> names = new ArrayList<>() {
            {
                add("Gerard"); // another way to initialize ArrayLists
                add("Banana Cat"); // basically names.add("...");
                add("Gritty");
            }
        };

        // put a bucket in a bucket - an ArrayList that holds another ArrayList
        ArrayList<ArrayList<String>> things = new ArrayList<>();
        things.add(assignments);
        things.add(names);

//        System.out.println(assignments);
//        System.out.println(names);
//        System.out.println(things);

//        for (int i = 0; i < assignments.size(); i++) {
//            System.out.println(assignments.get(i));
//        }

//        for (String name : names) {
//            System.out.println(name);
//        }

        for (int i = 0; i < things.size(); i++) {
            for (String item : things.get(i)) {
                System.out.println(item);
            }
        }
    }
}
