import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ContactList {
    HashMap<String, Integer> contacts = new HashMap<>();

    public void addContact(String name, Integer number) {
        contacts.put(name, number);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    @Override
    public String toString() {
        return "ContactList [contacts=" + contacts + "]";
    }

    public boolean doesContactNameExist(String name) {

        for (String key: contacts.keySet())
            if (key.equals(name))
                   return true;

        return false;
    }

    public boolean doesContactNumberExist(Integer number) {

        for (int value : contacts.values())
            if (value == number)
                return true;

        return false;
    }

    public void listAllContacts() {
        Set<Entry<String, Integer>> set = contacts.entrySet();
        Iterator<Entry<String, Integer>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> me = it.next();
            System.out.println(me);
        }

    }
}
