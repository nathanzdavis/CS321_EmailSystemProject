/*
Names: Andrew Deerman, Anthony Montemuro, Daniel Bangham, Nathan Davis
Date: 4/25/2021
Assignment: Group Programming Assignment (Part 3)
About: This file declares and defines the User class.
*/
import java.util.ArrayList;

public class User {
        
    /**
     * Constructor for User class.
     * @precondition username is of type String
     * @postcondition A new instance of type Email is instantiated.
     * @param name contains the name of the user.
     */
    public User(String name) {
        username = name;
        Inbox = new ArrayList<Email>();
        Sent = new ArrayList<Email>();
        Trash = new ArrayList<Email>();
    }
    
    /**
     * Get name method for User class.
     * @precondition An instance of User has been created.
     * @postcondition A string containing the username is returned.
     * @return name attribute
     */
    public String getUsername() {
        return username;
    }
    
    public void addToInbox(Email e){
        Inbox.add(e);
    }
    
    public void removeFromInbox(Email e){
        Inbox.remove(e);
    }
    
    public void addToSent(Email e){
        Sent.add(e);
    }
    
    public void removeFromSent(Email e){
        Sent.remove(e);
    }
    
    public void addToTrash(Email e){
        Trash.add(e);
    }
    
    public void removeFromTrash(Email e){
        Trash.remove(e);
    }
    
    //Attributes
    private String username;
    ArrayList<Email> Inbox;
    ArrayList<Email> Sent;
    ArrayList<Email> Trash;
}
