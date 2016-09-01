package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Unit {

    /** stores block number, not listed as final as address can be changed*/
     private String unit;

     /** Determines if it is a valid block*/

     private boolean isValidUnit(){
       if(this.unit != null | this.unit.length() != 0  ){
         return true;

       }else{
         return false;
       }

     }

     public Unit(String unit){
       this.unit = unit;
     }

     public String getUnit(){
       return this.unit;

     }
     public void setUnit(String unit){
       this.unit = unit;
     }
}
