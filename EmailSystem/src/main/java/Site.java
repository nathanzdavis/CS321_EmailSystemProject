/*
Names: Andrew Deerman, Anthony Montemuro, Daniel Bangham, Nathan Davis
Date: 4/25/2021
Assignment: Group Programming Assignment (Part 3)
About: This file declares and defines the Site class.
*/
import java.util.ArrayList;

public class Site {
        
    /**
     * Constructor for Site class.
     * 
     * @precondition name is of type String.
     * @postcondition An instance of Site has been created.
     * @param name name of the site to be added
     */
    public Site(String name) {
        userList = new ArrayList<User>();
        siteName = name;
    }
    
    /**
     * Add User method for Site class.
     * 
     * @precondition An instance of Site has been created.
     * @postcondition A new user has been added to the user list.
     * @param u is the user to be added
     */
    public void addUser(User u){
        userList.add(u);
    }
    
    /**
     * Remove User method for Site class.
     * 
     * @precondition An instance of Site has been created.
     * @postcondition User u has been removed from userList.
     * @param u is the user to be removed from userList.
     */
    public void removeUser(User u){
        userList.remove(u); //I don't think this will work. -Tony
    }
    
    /**
     * Get Site Name method for Site class.
     * 
     * @precondition An instance of Site has been created.
     * @postcondition Name of site is returned.
     * @return siteName, a string that stores the name of the site.
     */
    public String getSiteName(){
        return siteName;
    }
    
    //Attributes
    ArrayList<User> userList;
    private final String siteName;
}
