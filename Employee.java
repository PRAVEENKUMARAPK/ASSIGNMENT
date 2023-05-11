package week3.day3;

public class Employee {
        public void getEmployeeName(String empName) {
        	System.out.println("employee name:+empName");
        	
        }
        public void getEmployeeid(int empid) {
        	System.out.println("employeeid:+empId");
        	
        }
       public void  getEmployeeAddress(String empAddress) {
	
       System.out.println("employee address:+empAddress");
       
       }
         public  void getEmployeeSalary(double empSalary) {
        	 System.out.println("employee Salary:+empSalary");
         }
         public void getEmployeeMobileNumber(long mobNum) {
        	 System.out.println("mobile number:"+mobNum);
        	 
         }
         public static void Main(String[] args) 
         {
              EmployeeDetails emp = new EmployeeDetails();
        	 emp.getEmployeeName("praveen kumar");
        	 emp.getEmployeeid(30283);
        	 emp.getEmployeeAddres("chennai");
        	 emp.getEmployeeSalary(14000);
        	 emp.getEmployeeMobileNumber(8770945660L);
        	 
         }
        	 
        	 
        	 

}      