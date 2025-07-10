package com.kvhatte;

import java.util.*;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final EmployeeDAO dao = new EmployeeDAO();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add 2.View All 3.Update 4.Delete 5.Exit");
            System.out.print("Choice: ");
            int c = sc.nextInt(); sc.nextLine();
            switch (c) {
                case 1: add(); break;
                case 2: viewAll(); break;
                case 3: update(); break;
                case 4: delete(); break;
                case 5: System.out.println("Goodbye!"); return;
                default: System.out.println("Invalid.");
            }
        }
    }

    private static void add() {
        System.out.print("Name: "); String n = sc.nextLine();
        System.out.print("Age: "); int a = sc.nextInt(); sc.nextLine();
        System.out.print("Dept: "); String d = sc.nextLine();
        System.out.print("Salary: "); double s = sc.nextDouble(); sc.nextLine();
        dao.add(new Employee(0, n, a, d, s));
    }

    private static void viewAll() {
        List<Employee> list = dao.getAll();
        System.out.println("ID | Name | Age | Dept | Salary");
        list.forEach(e -> System.out.printf("%d | %s | %d | %s | %.2f\n",
            e.getId(), e.getName(), e.getAge(), e.getDepartment(), e.getSalary()));
    }

    private static void update() {
        System.out.print("ID to update: "); int i = sc.nextInt(); sc.nextLine();
        System.out.print("New Name: "); String n = sc.nextLine();
        System.out.print("New Age: "); int a = sc.nextInt(); sc.nextLine();
        System.out.print("New Dept: "); String d = sc.nextLine();
        System.out.print("New Salary: "); double s = sc.nextDouble(); sc.nextLine();
        dao.update(new Employee(i, n, a, d, s));
    }

    private static void delete() {
        System.out.print("ID to delete: "); int i = sc.nextInt(); sc.nextLine();
        dao.delete(i);
    }
}
