package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class PostalCode {

    /** stores block number, not listed as final as address can be changed*/
     private String postalCode;

     /** Determines if it is a valid block*/

     private boolean isValidPostalCode(){
       if(this.postalCode != null | this.postalCode.length() != 0  ){
         return true;

       }else{
         return false;
       }

     }

     public PostalCode(String postalCode){
       this.postalCode = postalCode;
     }

     public String getPostalCode(){
       return this.postalCode;

     }
     public void setPostalCode(String postalCode){
       this.postalCode = postalCode;
     }
}
