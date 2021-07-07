/**
 * Person class to model a person hospitalized with a resulting medical bill.
 * 
 * @author dpeters
 *
 */

public class Person {
	private int id;
    private String firstName;
    private String lastName;
    
    /**
     * Medical Bill object
     */
    private MedicalProcedureAPI medicalBill;
       
    public Person() {
        super();
    }
    
    /**
     * (TO BE COMPLETED BY STUDENT)
     */

 

    /**
     * return a String representation of the object state
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("# ").append(id);
        sb.append(" ").append(firstName);
        sb.append(" ").append(lastName);
        sb.append(", my bill ").append(medicalBill);
        
        return sb.toString();
   }
    
    /**
     * demonstrate the use of this class
     */
    public static void demo() {
        System.out.println("\n\t" + Person.class.getName() + ".demo()...");
        
        Person dan = new Person();
        
        /**
         * My MGH hospitalization and resulting Billing statement
         * which include medical expenses for XRAY and MRI
         * 
         * (TO BE COMPLETED BY STUDENT)
         */

 

        /**
         * show all patient information with billing statement
         */
        System.out.println(dan);
        
        /**
         * My MGH billing statement updated with added miscellaneous expenses from Legacy Objects
         * which include miscellaneous expenses from Toothpaste and Tylenol
         * 
         * (TO BE COMPLETED BY STUDENT)
         */
        
        /**
         * show all patient information with billing statement
         */
        System.out.println(dan);
        
        System.out.println("\n\t" + Person.class.getName() + ".demo()... done!");
    }
}
