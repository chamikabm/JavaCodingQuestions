package Knowledge.SortingWithComparableAndComparator.ComaratorInterface.Method2;

import java.util.Arrays;

public class TestComparator {

    public static void main(String[] args) {

        //sorting object array
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);
        empArr[4] = new Employee(1, "Dirk", 32, 50000);

        //sort employees array using Comparator by Salary
        Arrays.sort(empArr,  new EmployeeComparatorByIdAndName());
        System.out.println("Employees list sorted by Id and Name :\n"+Arrays.toString(empArr));
    }
}
