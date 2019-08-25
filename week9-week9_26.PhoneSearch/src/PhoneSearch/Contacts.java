package PhoneSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contacts {

    private Map<String, PersonalInfo> people;

    public Contacts() {
        this.people = new HashMap<String, PersonalInfo>();
    }

    //1
    public void addNumber(String who, String number) {
        try {
            people.get(who).addNumber(number);
        } catch (NullPointerException e) {
            people.put(who, new PersonalInfo());
            people.get(who).addNumber(number);
        }
    }

    //2
    public void searchForNumber(String who) {
        try {
            //people.get(who).getNumbers();
            for (String number : people.get(who).numbers) {
                System.out.println(" " + number);
            }
        } catch (Exception e) {
            System.out.println("  not found");
        }
    }

    //3
    public void searchByNumber(String numberQuery) {
        boolean found = false;

        for (String key : people.keySet()) {
            for (String number : people.get(key).getNumbers()) {
                if (number.equals(numberQuery)) {
                    System.out.println(" " + key);
                    found = true;
                } else if (!found) {
                    System.out.println(" not found");
                }

            }
        }
    }

    //4
    public void addAddress(String who, String street, String city) {
        try {
            people.get(who).setAddress(street, city);
        } catch (NullPointerException e) {
            people.put(who, new PersonalInfo());
            people.get(who).setAddress(street, city);
        }
    }

    //5
    public void personalInfo(String who) {
        try {
            if (people.get(who).getAddress().equals(" ")) {
                System.out.println("  address unknown");
            } else {

                try {

                    System.out.println("  address: " + people.get(who).getAddress());
                } catch (Exception e) {
                    System.out.println("  address unknown");
                }
            }

            if (people.get(who).getNumbers().isEmpty()) {
                System.out.println("  phone number not found");
            } else {

                try {
                    System.out.println("  phone numbers:");
                    for (String number : people.get(who).numbers) {
                        System.out.println("   " + number);
                    }
                } catch (Exception e) {
                    System.out.println("  phone number not found");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("  not found");
        }
    }

    //6
    public void removePersonalInfo(String who) {
        people.remove(who);
    }

    //7
    public void keywordSearch(String keyword) {
        //filtered search by keyword (retrieving a list must be sorted by name
        //in alphabetic order). Can be in name or address.
        List alphabeticKeys = new ArrayList<String>(people.keySet());
        boolean found = false;

        //SORT
        Collections.sort(alphabeticKeys);

        //IF KEYWORD IS EMPTY
        if (keyword.equals("") || keyword.isEmpty()) {
            for (Object key : alphabeticKeys) {
                if (people.get(key).getAddress().equals(" ")) {
                    System.out.println(" address unknown");
                } else {

                    try {

                        System.out.println(" address: " + people.get(key).getAddress());
                    } catch (Exception e) {
                        System.out.println("  address unknown");
                    }
                }

                if (people.get(key).getNumbers().isEmpty()) {
                    System.out.println("  phone number not found");
                } else {

                    try {
                        System.out.println(" phone numbers: ");
                        for (String number : people.get(key).numbers) {
                            System.out.println("  " + number);
                        }
                    } catch (Exception e) {
                        System.out.println("  phone number not found");
                    }
                }
            }
        }

        //CHECK ADDRESS FOR KEYWORD
        for (Object key : alphabeticKeys) {
            String keyString = key.toString();

            if (people.get(key).getAddress().contains(keyword)) {
                found = true;
                System.out.println("");
                System.out.println(" " + key);

                try {

                    System.out.println("  address: " + people.get(key).getAddress());
                } catch (Exception e) {
                    System.out.println("  address unknown");
                }
                //}

                if (people.get(key).getNumbers().isEmpty()) {
                    System.out.println("  phone number not found");
                } else {

                    try {
                        System.out.println("  phone numbers:");
                        for (String number : people.get(key).numbers) {
                            System.out.println("   " + number);
                        }
                    } catch (Exception e) {
                        System.out.println("  phone number not found");
                    }
                }
                //CHECK NAME FOR KEYWORD
            } else if (keyString.contains(keyword) || keyString.equals(keyword)) {
                found = true;
                System.out.println("");
                System.out.println(" " + key);

                if (people.get(key).getAddress().equals(" ")) {
                    System.out.println("  address unknown");
                } else {

                    try {

                        System.out.println("  address: " + people.get(key).getAddress());
                    } catch (Exception e) {
                        System.out.println("  address unknown");
                    }
                }

                if (people.get(key).getNumbers().isEmpty()) {
                    System.out.println("  phone number not found");
                } else {

                    try {
                        System.out.println("  phone numbers:");
                        for (String number : people.get(key).numbers) {
                            System.out.println("   " + number);
                        }
                    } catch (Exception e) {
                        System.out.println("  phone number not found");
                    }
                }
            }
        }
        if (!found) {
            System.out.println(" keyword not found");
        }
    }
}
