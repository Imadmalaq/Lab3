import java.util.*;

public class AddressBook{
    private ArrayList<BuddyInfo> buddyInfoList;

    public AddressBook() {
        buddyInfoList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null){
            buddyInfoList.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int i){
        if(i >= 0 && i < buddyInfoList.size()){
            return buddyInfoList.remove(i);
        }
        return null;
    }
    public static void main(String[] args){
        //System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

}
