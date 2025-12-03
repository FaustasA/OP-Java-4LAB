package model;

public abstract class Person {

    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract String getInfo();

    public void setName(String newName){
        this.name = newName;
    }

    public void setId(int newId){
        this.id = newId;
    }

}
