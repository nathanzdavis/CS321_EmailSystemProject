/*
Names: Andrew Deerman, Anthony Montemuro, Daniel Bangham, Nathan Davis
Date: 4/25/2021
Assignment: Group Programming Assignment (Part 3)
About: This file declares and defines the User class.
*/
import java.util.ArrayList;

public class EmailSystem {
     
    /**
     * Constructor for EmailSystem class.
     * 
     * @precondition currentU is of type User.
     * @postcondition A new object of type EmailSystem has been instantiated.
     * @param currentU the current user
     */
    public EmailSystem(User currentU) {
        currentUser = currentU;
        siteList = new ArrayList<Site>();
    }
    
    /**
     * Set Current User method for the EmailSystem class.
     * 
     * @precondition An object of type EmailSystem has been instantiated.
     * @postcondition The currentUser is set to u.
     * @param u is the new user to be set to currentUser.
     */
    public void setCurrentUser(User u){
        currentUser = u;
    }
    
    public User getCurrentUser(){
        return currentUser;
    }
    
    /**
     * Add Site method for the EmailSystem class.
     * 
     * @precondition An object of type EmailSystem has been instantiated.
     * @postcondition Site s is added to the siteList.
     * @param s new site to be added to siteList
     */
    public void addSite(Site s){
        siteList.add(s);
    }
    
    /**
     * Delete Site method for the EmailSystem class.
     * 
     * @precondition An object of type EmailSystem has been instantiated.
     * @postcondition Site s is removed from siteList.
     * @param s the site to be removed from siteList.
     */
    public void deleteSite(Site s){
        siteList.remove(s); //I don't think this will work. -Tony
    }
    
    /**
     * Send Email method for the EmailSystem class.
     */
    public void sendEmail(){
        
    }
    
    //Attributes
    User currentUser;
    ArrayList<Site> siteList;
}
