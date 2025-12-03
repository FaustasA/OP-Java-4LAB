package operations;

import model.Group;

import java.util.List;

public interface GroupOperations {

    void addGroup(String name);
    Group findGroupbyId(int groupId);
    List<Group> getAllGroups();

}
