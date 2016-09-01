package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Block {

    /** stores block number, not listed as final as address can be changed*/
     private String blockNo;

     /** Determines if it is a valid block*/



     private boolean isValidBlock(){
       if(this.blockNo != null | this.blockNo.length != 0  ){
         return true;

       }else{
         return false;
       }
     }
/** Constructors */
     public Block(String blockNo){
       this.blockNo = blockNo;
     }
     
     public Block(){

     }





/** Setters and Getters*/

     public String getBlock(){
       return this.blockNo;

     }
     public void setBlock(String blockNo){
       this.blockNo = blockNo;
     }
}
