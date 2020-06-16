public class Map4 {

    public static void main(String[] args) {
        ContactList contactsList = new ContactList();

        contactsList.addContact("Alicia Cara", 558974);
        contactsList.addContact("Brie Larson", 963214);
        contactsList.addContact("Preety Shah", 157896);

        System.out.println("Name Exists? : " + contactsList.doesContactNameExist("Brie Larson"));
        System.out.println("Number Exists? : " + contactsList.doesContactNumberExist(157896));

        System.out.println();
        contactsList.listAllContacts();
    }

}
