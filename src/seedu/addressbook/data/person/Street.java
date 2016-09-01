package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Street {

    /** stores block number, not listed as final as address can be changed*/
     private String street;

     /** Determines if it is a valid block*/

     private boolean isValidStreet(){
       if(this.street != null | this.street.length() != 0  ){
         return true;

       }else{
         return false;
       }

     }

     public Street(String street){
       this.street = street;
     }

     public String getStreet(){
       return this.street;

     }
     public void setStreet(String street){
       this.street = street;
     }
}
