package model;

public class Student extends Person{

    private Group group;

    public Student(String name, int id){
        super(name, id);
    }

    @Override
    public String getInfo() {
        if(group != null){
            return "Student:" + name + "(ID: " + id + "), Group: " + group.getName();
        }
        return  "Student:" + name + "(ID: " + id + "), No Group";
    }

    public void assignGroup(Group group){
        this.group = group;
    }

    public Group getGroup(){
        return group;
    }


}
