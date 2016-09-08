package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's contact in the address book.
 * Parent class of Phone, Email and Address
 */

 public class Contact {
   public final String value;
   private boolean isPrivate;

   public boolean isPrivate() {
       return isPrivate;
   }

 }
