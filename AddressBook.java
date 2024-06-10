import java.util.ArrayList;
public class AddressBook
{
    ArrayList<String>names;
    ArrayList<String>phoneNumbers;
    public AddressBook()
    {
       names=new ArrayList<String>();
        phoneNumbers=new ArrayList<String>();
    }

    public void addContact(String name,String phoneNumber)
    {
        names.add(name);
        phoneNumbers.add(phoneNumber);
    }

    public void removeContact(String name)
    {
        int index=names.indexOf(name);
        if(index!=-1)
        {
            names.remove(index);
            phoneNumbers.remove(index);
        }
    }

    public String getPhoneNumber(String name)
    {
        int index=names.indexOf(name);
        System.out.println("\nThe Phone Number is:");
        if(index!=-1)
        {
            return phoneNumbers.get(index);

        }
        return null;
    }
    public void printContacts()
    {
        System.out.println("\nCONTACTS:\n");
        for(int i=0;i<names.size();i++)
        {
            System.out.println(names.get(i)+":"+phoneNumbers.get(i));
        }
    }
}
class Main 
{    
    public static void main(String[] arg)
    {
        AddressBook st=new AddressBook();
        st.addContact("Alan","9845413182");
        st.addContact("Anush","7353841262");
        st.addContact("Charlie","8745126502");

        st.printContacts();

        st.removeContact("Charlie");

        System.out.println(st.getPhoneNumber("Alan"));
        System.out.println(st.getPhoneNumber("Anush"));

        st.printContacts();
    }
    
}

