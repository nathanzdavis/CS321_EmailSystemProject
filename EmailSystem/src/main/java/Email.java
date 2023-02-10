/*
Names: Andrew Deerman, Anthony Montemuro, Daniel Bangham, Nathan Davis
Date: 4/25/2021
Assignment: Group Programming Assignment (Part 3)
About: This file declares and defines the Email class.
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Email {
    //Methods
    
    /**
     * Constructor for Email class.
     * @precondition sub is of type String, msg is of type String.
     * @postcondition A new instance of type Email is instantiated.
     * @param sub contains the subject of the email.
     * @param msg contains the message of the email.
     * @param recip contains the recipient of the email.
     * @param sndr contains the sender of the email.
     */
    public Email(String sub, String msg, String recip, String sndr) {
        subject = sub;
        message = msg;
        recipient = recip;
        sender = sndr;
        date = LocalDateTime.now();
    }
    
    /**
     * Get Subject method for Email class.
     * @precondition An instance of Email has been created.
     * @postcondition The subject of the email is returned.
     * @return subject attribute
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * Get Message method for Email class.
     * @precondition An instance of Email has been created.
     * @postcondition The message of the email is returned.
     * @return message attribute
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Get Recipient method for Email class.
     * @precondition An instance of Email has been created.
     * @postcondition The recipient of the email is returned.
     * @return recipient attribute
     */
    public String getRecipient() {
        return recipient;
    }
    
    /**
     * Get Sender method for Email class.
     * @precondition An instance of Email has been created.
     * @postcondition The sender of the email is returned.
     * @return sender attribute
     */
    public String getSender() {
        return sender;
    }
    
    /**
     * Get Date method for Email class.
     * @precondition An instance of Email has been created.
     * @postcondition The private attribute date is formatted and converted to a
     * String type, and returned.
     * @return date attribute formatted and returned as string object
     */
    public String getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String strDate = date.format(formatter);
        return strDate;
    }
    
    //Attributes
    private final String subject;
    private final String message;
    private final String recipient;
    private final String sender;
    LocalDateTime date;
}
