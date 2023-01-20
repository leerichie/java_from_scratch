package org.example.apps.crud_scan_collection;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Employee> c = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);

        int ch;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~");
            System.out.println("   * Main Menu *   ");
            System.out.println("~~~~~~~~~~~~~~~~~~~");
            System.out.println("1.  Insert");
            System.out.println("2.  Display");
            System.out.println("3.  Search");
            System.out.println("4.  Delete");
            System.out.println("5.  Update");
            System.out.println("~~~~~~~~~~~~~~~~~~~");
            System.out.println("Choose an option or 0 to exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1: // create
                    System.out.print("Enter ID number: ");
                    int num = sc.nextInt();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter profession: ");
                    String prof = sc.next();
                    System.out.print("Enter salary (GBP): ");
                    int salary = sc.nextInt();
                    System.out.println("\nSuccessfully added!\n");
                    c.add(new Employee(num, name, prof, salary));
                    break;
                case 2: // display
                    System.out.println("~~~~~~~~~~~~~~~~~~~");
                    Iterator<Employee> i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("~~~~~~~~~~~~~~~~~~~");
                    break;
                case 3: //search
                    boolean found = false;
                    System.out.println("Enter ID to search for: ");
                    int idNum = sc.nextInt();
                    System.out.println("~~~~~~~~~~~~~~~~~~~");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.getIdNum() == idNum) {
                            System.out.println("Results:");
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No entries founds\n");
                    }
                case 4: // delete
                    found = false;
                    System.out.println("Enter ID to delete: ");
                    idNum = sc.nextInt();
                    System.out.println("~~~~~~~~~~~~~~~~~~~");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.getIdNum() == idNum) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No entries founds\n");
                    } else {
                        System.out.println("Entry deleted!");
                    }
                    break;
                case 5: // update
                    found = false;
                    System.out.println("Enter ID to update: ");
                    idNum = sc.nextInt();
                    System.out.println("~~~~~~~~~~~~~~~~~~~");
                    ListIterator<Employee> li = c.listIterator();
                    while (li.hasNext()) {
                        Employee e = li.next();
                        if (e.getIdNum() == idNum) {
                            System.out.print("Enter new Name: ");
                            name = sc.next();
                            System.out.print("Enter new Profession: ");
                            prof = sc.next();
                            System.out.print("Enter new Salary: ");
                            salary = sc.nextInt();
                            li.set(new Employee(idNum, name, prof, salary));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No entries founds\n");
                    } else {
                        System.out.println("Entry updated!");
                    }
                    break;
            }
        }
        while (ch != 0) ;
    }
}