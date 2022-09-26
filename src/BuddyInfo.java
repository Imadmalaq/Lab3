public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public BuddyInfo() {
        name = "unknown";
    }

    public static void main(String[] args) {
        BuddyInfo obj = new BuddyInfo();
        obj.name = "Homer";
        System.out.println("Hello " + obj.name + "!");
    }
}

