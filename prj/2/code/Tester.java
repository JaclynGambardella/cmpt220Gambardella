import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	
	public static void main (String[] args) {
			        
			                int option = 0;
			                
			                ArrayList < PatientInformation> patientInfo = new ArrayList < PatientInformation >();
			                ArrayList < VisitType > visitTypes = new ArrayList < VisitType >();
			               
			              
			                Scanner select = new Scanner(System.in);
			                Scanner choice = new Scanner(System.in);
			                
				        	
			                VisitType testVisit = new VisitType(1, "test visit");
			        	   
			        	    visitTypes.add(testVisit);
		                	patientInfo.add(new PatientInformation("Monday", "10 am", visitTypes.get(0)));
		                	
		                	
		                	patientInfo.add(new PatientInformation("Tuesday", "10 am", visitTypes.get(0)));
		                	
		                	
		                	patientInfo.add(new PatientInformation("Monday", "2 pm", visitTypes.get(0)));
		                	
		                	
		                	patientInfo.add(new PatientInformation("Tuesday", "2 pm", visitTypes.get(0)));
		                	
		                
		                	patientInfo.add(new PatientInformation("Wednesday", "5 pm", visitTypes.get(0)));
		                	
		                	
		                	patientInfo.add(new PatientInformation("Thursday", "10 am", visitTypes.get(0)));
		                	
		                	
		                	
		                
		                	
			            do {
			           
			            	System.out.println("                             ");
			            	
			           System.out.println("WELCOME TO THE MARIST COLLEGE HEALTH SERVICES OFFICE");
			            		System.out.println("-----------------------------------------------------");
			            		
			            	System.out.println("Please select your doctor from the following list.");
			            	
			            	System.out.println("                             ");

			 	
			                System.out.println("1: Dr. Sam");
			                System.out.println("2: Dr. Ellie ");
			                System.out.println("3: Dr. Mandy");
			                
			        
			               	
			                System.out.println(" ");
			                System.out.print("Enter Choice 1, 2 or 3: ");
			                    option = select.nextInt();
			                    
			                    	if(option==1) {
			                    		
			                        System.out.println("");
			                    	System.out.println("Enter your date of birth [DD/MM/YYYY]: ");	
				                    String dOB = choice.nextLine();
				                    System.out.println(" ");
				                    System.out.println("Enter your last Name: ");	
				                    String lastName = choice.nextLine();			              
				                    System.out.println("Enter the name of your health Insurance: ");	
				                    String healthIns = choice.nextLine();
				                    
				                    System.out.println(" ");
				                   
				                    System.out.println("Doctor Sam is available at these times: ");
				                    System.out.println(" ");
				                    for (int i = 4; i< 6; i++) {
			                        	
			                         	int apptNumber = i+1;
			                         	System.out.println("Day:   " + patientInfo.get(i).getLastName());
			                         	System.out.println("Time:   " + patientInfo.get(i).getDOB());
			                        	System.out.println("Appointment: " + apptNumber);;
			                            
			                           
			                            System.out.print("\n");
			                       }
				                    System.out.println("");
			                        System.out.print("Enter the appointment number: ");
			                        	int apptNumber = choice.nextInt();
			                        	int repeat = 0;
			                        System.out.println();
			                        
			                        System.out.println("Please select the type of visit.");
			                        System.out.println(" ");
			                        System.out.println("1: New Patient");
					                System.out.println("2: Returning Patient ");
					                System.out.println("3: Follow up visit");
					                System.out.println("4: Urgent visit");
					                
					        
					               	
					                System.out.println(" ");
					                System.out.print("Enter Choice 1, 2, 3 or 4: ");
					                    option = select.nextInt();
			                        
			                        
			                        do {
			                        	if(option ==1){
			                        		System.out.println("");
			                        		System.out.println("Welcome new patient!");
			                            } else{
			                            	System.out.println("");
			                        	System.out.println("Welcome back, we are looking forward to hepling you as soon as possible.");
			                    	}
			                        	
			                        	
			                        	System.out.println(" ");
				                        System.out.println("Appointment Details: ");
				                        System.out.println("---------------------");
				                        System.out.println("Patient Date of Birth: " + dOB);
				                        System.out.println("Patient Last Name: " + lastName); 
				                        System.out.println("Patient Health Insurance: " + healthIns);
				                        System.out.println("Patient Appointment Number: " + apptNumber);
				                        System.out.println("");
				                        System.out.println("Thank you for booking your appointment!");
			                        	
			                        	
			                        	
			                        	
				                       System.out.println("If any of this information is incorrect, please press 1 and start over:");
				                       		option = select.nextInt();
				                       		
				                       		if(option==1);
				                       			repeat = 1;
			                        
			                      
			                       } 
			                       while (repeat == 0);
			                    	}
			                     
			                     
			                    if(option == 2) {
			                    	System.out.println("");
			                    	System.out.println("Enter your date of birth [DD/MM/YYYY]: ");	
				                    String dOB = choice.nextLine();
				                    System.out.println(" ");
				                    System.out.println("Enter your last Name: ");	
				                    String lastName = choice.nextLine();
				                    System.out.println("Enter the name of your health Insurance: ");	
				                    String healthIns = choice.nextLine();
				                    System.out.println(" ");
				                   
				                    System.out.println("Doctor Ellie is available at these times: ");
				                    System.out.println(" ");
			                        
			                        
			                        for (int i =2 ; i < 4; i++) {
			                        	
			                         	int apptNumber = i+1;
			                         	System.out.println("Day:   " + patientInfo.get(i).getLastName());
			                         	System.out.println("Time:   " + patientInfo.get(i).getDOB());
			                        	System.out.println("Appointment: " + apptNumber);;
			                            
			                           
			                            System.out.print("\n");
			                       }
			                        System.out.println("");
			                        System.out.print("Enter the appointment number: ");
			                        	int apptNumber = choice.nextInt();
			                        	int repeat = 0;
			                        System.out.println();
			                        
			                        
			                        
			                        
			                        System.out.println("Please select the type of visit.");
			                        System.out.println(" ");
			                        System.out.println("1: New Patient");
					                System.out.println("2: Returning Patient ");
					                System.out.println("3: Follow up visit");
					                System.out.println("4: Urgent visit");
					                
					        
					               	
					                System.out.println(" ");
					                System.out.print("Enter Choice 1, 2, 3 or 4: ");
					                    option = select.nextInt();
					                    
					                    
					                do {
				                        if(option ==1){
				                        	System.out.println("");
				                        	System.out.println("Welcome new patient!");
				                            } else{
				                            System.out.println("");
				                        	System.out.println("Welcome back, we are looking forward to hepling you as soon as possible.");
				                    	    }
				                        	
				                        	
				                        	System.out.println(" ");
					                        System.out.println("Appointment Details: ");
					                        System.out.println("---------------------");
					                        System.out.println("Patient Date of Birth: " + dOB);
					                        System.out.println("Patient Last Name: " + lastName); 
					                        System.out.println("Patient Health Insurance: " + healthIns);
					                        System.out.println("Patient Appointment Number: " + apptNumber);
					                        System.out.println("");
					                        System.out.println("Thank you for booking your appointment!");
				                        	
				                        	
				                        	
				                        	
					                       System.out.println("If any of this information is incorrect, please press 1 and start over:");
					                       		option = select.nextInt();
					                       		
					                       		if(option==1);
					                       			repeat = 1;
				                        	
					                	
				                        
					                
				                       } 
				                       while (repeat == 0);
			                    }
				                       
			          
			       
			                    
			                    if(option == 3) {
			                    	System.out.println("");
			                    	System.out.println("Enter your date of birth [DD/MM/YYYY]: ");	
				                    String dOB = choice.nextLine();
				                    System.out.println(" ");
				                    System.out.println("Enter your last Name: ");	
				                    String lastName = choice.nextLine();
				                    System.out.println("Enter the name of your health Insurance: ");	
				                    String healthIns = choice.nextLine();
				                    System.out.println(" ");
				                   
				                    System.out.println("Doctor Mandy is available at these times: ");
				                    System.out.println(" ");
			                    
			                    
			                    for (int i = 0; i< 2; i++) {
		                        	
		                         	int apptNumber = i+1;
		                         	System.out.println("Day:   " + patientInfo.get(i).getLastName());
		                         	System.out.println("Time:   " + patientInfo.get(i).getDOB());
		                        	System.out.println("Appointment: " + apptNumber);;
		                            
		                           
		                            System.out.print("\n");
		                       }
			                    
			                    System.out.println("");
		                        System.out.print("Enter the appointment number: ");
		                        	int apptNumber = choice.nextInt();
		                        	int repeat = 0;
		                        System.out.println();
		                        
		                        
		                        System.out.println("Please select the type of visit.");
		                        System.out.println(" "); 
		                        System.out.println("1: New Patient");
				                System.out.println("2: Returning Patient ");
				                System.out.println("3: Follow up visit");
				                System.out.println("4: Urgent visit");
				                
				        
				               	
				                System.out.println(" ");
				                System.out.print("Enter Choice 1, 2, 3 or 4: ");
				                    option = select.nextInt();
		                        
		                        
		                        do {
		                        	if(option ==1){
		                        		System.out.println("");
		                        		System.out.println("Welcome new patient!");
		                            } else{
		                            System.out.println("");
		                        	System.out.println("Welcome back, we are looking forward to hepling you as soon as possible.");
		                    	}
		                        	
		                        	
		                        	System.out.println(" ");
			                        System.out.println("Appointment Details: ");
			                        System.out.println("---------------------");
			                        System.out.println("Patient Date of Birth: " + dOB);
			                        System.out.println("Patient Last Name: " + lastName); 
			                        System.out.println("Patient Health Insurance: " + healthIns);
			                        System.out.println("Patient Appointment Number: " + apptNumber);
			                        System.out.println("");
			                        System.out.println("Thank you for booking your appointment!");
		                        	
		                        	
		                        	
		                        	
			                       System.out.println("If any of this information is incorrect, please press 1 and start over:");
			                       		option = select.nextInt();
			                       		
			                       		if(option==1);
			                       			repeat = 1;
		                        
		                      
		                       } 
		                       while (repeat == 0);
		                    	}
		                     
		                        	
		                        		
		                        
		                        
		                
			                                                           	                                	                                	                               
			              
			        }
			        	       
			            
			            
			            while(true);
}
}
