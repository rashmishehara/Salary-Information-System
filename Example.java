import java.util.Scanner;

class Example{
	public static void main (String args[]){
		Scanner input=new Scanner(System.in);

		System.out.println(" -----------------------------------------------------------------------------------");
		System.out.println(" |                            SALARY INFORMATION SYSTEM                            |");
		System.out.println(" -----------------------------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("            [1] Calculate Income Tax   ");
		System.out.println("            [2] Calculate Annual Bonus  ");
		System.out.println("            [3] Calculate Loan Amount    ");
		System.out.println(" ");


		System.out.print("Enter an option to continue > ");
		int opt=input.nextInt();
		System.out.println();
		
		String name;
		int salary;

		switch(opt){
			case 1: 
			
			System.out.println(" -----------------------------------------------------------------------------------");
			System.out.println(" |                              Calculate Income Tax                               |");
			System.out.println(" -----------------------------------------------------------------------------------");
			System.out.println();
			input.nextLine();
			
			System.out.print("Input Employee name   - ");
			name = input.nextLine();
			
			System.out.print("Input Employee salary - ");
			salary=input.nextInt();
			
			double intax=0.0;
			
			if (salary <= 100000){
				intax = 0.0;
			}else if (salary <= 141667){
				intax = (salary-100000)*0.06;
			}else if (salary <= 183333){
				intax = 2500 + ((salary-141667)*0.12);
			}else if (salary <= 225000){
				intax = 7500 + ((salary-183333)*0.18);
			}else if (salary <= 266667){
				intax = 15000 + ((salary-225000)*0.24);
			}else if (salary <= 308333){
				intax = 25000 + ((salary-266667)*0.3);
			}else{
				intax = 37500 + ((salary-308333)*0.36);
			}
			System.out.println("You have to pay Income Tax per month: "+intax);
			
			break;
			
			case 2: 
			
			System.out.println(" -----------------------------------------------------------------------------------");
			System.out.println(" |                             Calculate Annual Bonus                              |");
			System.out.println(" -----------------------------------------------------------------------------------");
			System.out.println();
			input.nextLine();

			System.out.print("Input Employee name   - ");
			name = input.nextLine();
			
			System.out.print("Input Employee salary - ");
			salary =input.nextInt();
			
			double anbonus=0.0;
			
			if (salary <= 100000){
				anbonus = 5000;
			}else if (salary <= 199999){
				anbonus = salary * 0.1;
			}else if (salary <= 299999){
				anbonus = salary * 0.15;
			}else if (salary <= 399999){
				anbonus = salary * 0.2;
			}else{
				anbonus = salary * 0.35;
			}
			
			System.out.println("Annual bonus   -  "+anbonus);
			
			break;
			
			case 3:
			
			System.out.println(" -----------------------------------------------------------------------------------");
			System.out.println(" |                             Calculate Loan Amount                               |");
			System.out.println(" -----------------------------------------------------------------------------------");
			System.out.println();	
			input.nextLine();
			
			System.out.print("Input Employee name   - ");
			name = input.nextLine();
			
			System.out.print("Input Employee salary - ");	
			salary = input.nextInt();
			
			if (salary <= 50000){
				System.out.println("    You can not get a loan because your salary is lessthan Rs.50 000...");
			
			}else{
				
				System.out.print("Enter number of year  - ");
				int year = input.nextInt();
				
				int n = year * 12;
				double r = 0.15;
				double Installment = 0.6 * salary;
				double r2 = r/12;

				double LoanAmount = Installment * (1 - Math.pow(1 + r2, -n)) / (r2);
				LoanAmount = Math.round(LoanAmount / 1000) * 1000;

				System.out.print(" You can get Loan Amount : " + LoanAmount);
				
			}
			
			break;
			
			default: System.out.println("Enter an valid option...");

		}
	}
}




