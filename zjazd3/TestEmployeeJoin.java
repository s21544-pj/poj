/*
Author:Mariusz Krzyżopolski
Summary:test klasy EmployeeJoin zadanie 16
*/
import java.util.*;

public class TestEmployeeJoin{
	public static void main (String[]args)
  	{
    ArrayList<EmployeeJoin> empList = new ArrayList<EmployeeJoin>();
    empList.add(new EmployeeJoin("Mariusz",3000,"01/03/2020"));
    empList.add(new EmployeeJoin("Zofia",1800,"23/03/2010"));
    empList.add(new EmployeeJoin("Stefan",9000,"11/04/2018"));
    empList.add(new EmployeeJoin("Zdzislaw",10000,"15/09/2019"));
    empList.add(new EmployeeJoin("Ania",2500,"17/05/2011"));
    empList.add(new EmployeeJoin("Mateusz",6000,"13/01/2017"));
    empList.add(new EmployeeJoin("Eryk",5000,"26/12/2015"));
    empList.add(new EmployeeJoin("Gunar",4000,"04/02/2020"));

    empList.forEach((emp)->System.out.println(emp.printData()));
  	}
}