package school.management.system;


/**
 * This class is responsible of keeping track of
 * a teachers name id and salary
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     *
     * @param id id for teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the ID of the teacher
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return the name of the teacher
     */

    public String getName(){
        return name;
    }

    /**
     *
     * @return the salary of the teacher
     */

    public int getSalary(){
        return salary;
    }


    /**
     *
     * @param salary is being set
     */
    public void setSalary(int salary){
        this.salary=salary;
    }


    /**
     * Adds to salary
     * removes from total money earned to GHS
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        school.updateMoneySpent(salary);
    }

}
