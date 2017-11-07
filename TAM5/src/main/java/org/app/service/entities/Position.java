package org.app.service.entities;

public class Position {

    private String id;
    private String name;
    private String departmentId;
    private int level;
    private boolean positionStatusOpen;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isPositionStatusOpen() {
        return positionStatusOpen;
    }

    public void setPositionStatusOpen(boolean positionStatusOpen) {
        this.positionStatusOpen = positionStatusOpen;
    }
}
