public class Friend {
    String name;
    static int noOfFriends = 0;

    Friend(String name) {
        this.name = name;
        noOfFriends++;
    }

    static void display() {
        System.out.println("You have " + noOfFriends + " friends");
    }
}
