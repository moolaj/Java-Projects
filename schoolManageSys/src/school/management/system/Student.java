package school.management.system;

/*
This class is responsible for keeping track of the students fees, name
 */

public class Student {

private int id;
private String name;
private int grade;
private int feesPaid;
private int feesTotal;


    /**
     *
     * @param id unique student ID
     * fees for every student is $30,000
     * fees paid is initially 0.
     * @param name name of the student
     * @param grade grade of the student
     */

    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //not going to alter students name, students id.

    /**
     * Used to update the students grade
     * @param grade new grade of the student
     */

    public void setGrade (int grade){

        this.grade = grade;

    }


    /**
     * Keep adding the fees to feesPaid Field
     * Add the fees to the fees paid
     * The school is going to receive the funds
     *
     * @param fees
     */

    public void payFees(int fees){

        feesPaid += fees;
        school.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the student
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student
     */

    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees paid by the student
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student
     */

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

}
