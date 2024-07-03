package org.amit2.topics.OOPRelationship.Composition;


import java.util.ArrayList;
import java.util.List;


/*
 *
 * Composition represents an "has-a" relationship between a
 * two classes.
 * the part cannot exist independently of the whole. If the whole is destroyed, the parts are also destroyed.
 *
 * */

public class Room {

    void windows(){
        System.out.println("HAS WINDOWS");
    }
}


class House {
    private List<Room> rooms;
    public House() {
        rooms = new ArrayList<>();

    }
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public Room getRooms(int i){
        if( i > rooms.size())
            return null;
        return rooms.get(i);
    }
}
class Test{

    public static void main(String[] args){
        House house = new House();
        house.addRoom(new Room());
        house.addRoom(new Room());
        house.getRooms(1).windows();
        //house.getRooms(5).windows();


    }

}
