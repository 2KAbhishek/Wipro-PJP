package com.tm1.main;
public class TestStudent{
    public static void main(String[] args){
        String[][] empDetails = {
                                {"Emp No", "Emp Name", "Join Date", "Designation Code", "Department", "Basic", "HRA", "IT"},
                                {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
                                {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
                                {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
                                {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
                                {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
                                {"1006", "Suman", "01/01/2000", "e", "Manufacturing", "23000", "9000", "4400"},
                                {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
                                };

        String empNo = args[0];
        int rowIndex = 0;

        for (int i = 0; i <= 7; i++){
            if (empNo.equals(empDetails[i][0])){
                rowIndex = i;
            }
        }

        if (rowIndex == 0){
            System.out.println("There is no employee with empid : " + empNo);
            System.exit(1);
        }

        int salary = Integer.parseInt(empDetails[rowIndex][5]) + Integer.parseInt(empDetails[rowIndex][6]) - Integer.parseInt(empDetails[rowIndex][7]);
        String designation = "";
        char desCode = empDetails[rowIndex][3].charAt(0);

        switch (desCode){
            case 'e':
                designation = "Engineer";
                salary += 20000;
                break;
            case 'c':
                designation = "Consultant";
                salary += 32000;
                break;
            case 'k':
                designation = "Clerk";
                salary += 12000;
                break;
            case 'r':
                designation = "Receptionist";
                salary += 15000;
                break;
            case 'm':
                designation = "Manager";
                salary += 40000;
                break;

        }

        display(empDetails, rowIndex, designation, salary);
    }

    public static void display(String [][] empDetails, int n, String designation, int salary){
        System.out.printf("%-6s %-10s %-10s %-13s %-6s %n", empDetails[0][0], empDetails[0][1], empDetails[0][4], "Designation", "Salary");
        System.out.printf("%-6s %-10s %-10s %-13s %-6d %n", empDetails[n][0], empDetails[n][1], empDetails[n][4], designation, salary);
    }
}

