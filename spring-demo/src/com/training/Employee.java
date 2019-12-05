package com.training;

public class Employee {
    private int id;
    private String name;
    private Manager manager;
    private TeamLead teamLead;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
    }

    /*public Employee(int id, String name, Manager manager, TeamLead teamLead) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.teamLead = teamLead;
    }

    public Employee(){
        System.out.println("Default Constructor");
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
*/
    void show(){
        System.out.println(id + " " + name);
    }

    void show1(){
        System.out.println("For Employee Class " + id + " " + name);
        System.out.println("For Manager Class " + manager.id + " " + manager.name + " " + manager.dept );
        System.out.println("For Team Lead Class " + teamLead.id + " " + teamLead.name + " " + teamLead.dept + " " +teamLead.project );
    }
}
