import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "Simon Daniel";
		String timeManagement = "using a planner more often";
		String personalCommitment = "try not to procrastinate as much";
		String KPIMetrics = "number of players and different scores";
	
		System.out.println("Hello my name is " + name + ", the time management strategy that I would like to be held accountable\n"
		+ "to is " + timeManagement + ", I will personally commit to " + personalCommitment + ".\n" + "My business' main KPIs are " + KPIMetrics + ".");
		
	}
}