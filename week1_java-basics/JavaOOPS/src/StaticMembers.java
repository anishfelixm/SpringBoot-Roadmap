public class StaticMembers {
    public static void main(String[] args) {
        System.out.println(Friend.noOfFriends);

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

        Friend.display();
    }
}
