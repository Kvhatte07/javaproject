package com.kvhatte;

import java.sql.*;
import java.util.*;

public class EmployeeDAO {
    public void add(Employee e) {
        String sql = "INSERT INTO employees(name, age, department, salary) VALUES (?, ?, ?, ?)";
        try (Connection c = DBConnection.getConn();
             PreparedStatement p = c.prepareStatement(sql)) {
            p.setString(1, e.getName());
            p.setInt(2, e.getAge());
            p.setString(3, e.getDepartment());
            p.setDouble(4, e.getSalary());
            p.executeUpdate();
            System.out.println("Added.");
        } catch (SQLException ex) { ex.printStackTrace(); }
    }

    public List<Employee> getAll() {
        List<Employee> list = new ArrayList<>();
        try (Connection c = DBConnection.getConn();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM employees")) {
            while (r.next()) {
                Employee e = new Employee(
                    r.getInt("id"), r.getString("name"),
                    r.getInt("age"), r.getString("department"),
                    r.getDouble("salary"));
                list.add(e);
            }
        } catch (SQLException ex) { ex.printStackTrace(); }
        return list;
    }

    public void update(Employee e) {
        String sql = "UPDATE employees SET name=?, age=?, department=?, salary=? WHERE id=?";
        try (Connection c = DBConnection.getConn();
             PreparedStatement p = c.prepareStatement(sql)) {
            p.setString(1, e.getName());
            p.setInt(2, e.getAge());
            p.setString(3, e.getDepartment());
            p.setDouble(4, e.getSalary());
            p.setInt(5, e.getId());
            p.executeUpdate();
            System.out.println("Updated.");
        } catch (SQLException ex) { ex.printStackTrace(); }
    }

    public void delete(int id) {
        try (Connection c = DBConnection.getConn();
             PreparedStatement p = c.prepareStatement("DELETE FROM employees WHERE id=?")) {
            p.setInt(1, id);
            p.executeUpdate();
            System.out.println("Deleted.");
        } catch (SQLException ex) { ex.printStackTrace(); }
    }
}
