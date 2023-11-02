package project;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import project.entity.Project;
import project.exception.DbException;
import project.service.ProjectService;

public class Main {
	private Scanner scanner = new Scanner(System.in);
	private ProjectService projectService = new ProjectService();
	//@formatter:off
			private List<String> operations = List.of(
					"1) Add a project");
			
			
			//@formatter:on

	public static void main(String[] args) {
		new Main().displaymenu();
	}

	private void displaymenu() {
		boolean done = false;
		
		while(!done) {
			try {
			int operation = getOperation();
			switch (operation){
				case -1:
					done = exitMenu();
					break;
					
				case 1:
					addProject();
					break;
					
				default:
					System.out.println("\n" + operation + " is not valid. Try again.");
			}
			}catch(Exception e) {
				System.out.println("\nError:" + e.toString() + " Try again.");
			}
		}
	
	}
	
	private void addProject() {
		String project_name = getStringInput("Enter the project's name: ");
		BigDecimal estimated_hours = getBigDecimal("Enter the project's estimated time commitment: ");
		BigDecimal actual_hours = getBigDecimal("Enter the project's actual time commitment: ");
		Integer difficulty = getIntInput("Enter the project's difficulty (1-10) : ");
		String notes = getStringInput("Enter the project's notes: ");
	
		Project project = new Project();
		
		project.setProjcetName(project_name);
		project.setNotes(notes);
		project.setEstimatedHours(estimated_hours);
		project.setActualHours(actual_hours);
		project.setDifficulty(difficulty);
		
		Project dbProject = projectService.addProject(project);
		System.out.println("You added this project:\n" + dbProject);
		
		
	}
	private BigDecimal getBigDecimal(String prompt) {
		String input = getStringInput(prompt);
		if(Objects.isNull(input)) {
			return null;
		}
		try {
			return new BigDecimal(input).setScale(2);
		}
		catch (NumberFormatException e) {
			throw new DbException(input + "is not a valid decimal Number.");
		}
	}


	private boolean exitMenu() {
		System.out.println("\nExiting the menu.");
		return true;
		
	}

	private int getOperation() {
		printOperations();
		Integer op = getIntInput("Enter an operation number (press Enter to quit)");
		return Objects.isNull(op) ? -1 : op;
	}
	private Integer getIntInput(String prompt) {
		String input = getStringInput(prompt);
		if (Objects.isNull(input)) {
			return null;
		}
		try {
			return Integer.parseInt(input);
		} 
		catch (NumberFormatException e) {
			throw new DbException(input + " is not a valid number");
		}
	}
	private String getStringInput(String prompt) {
		System.out.println(prompt + ": ");
		String line = scanner.nextLine();
		return line.isBlank()? null : line.trim();
	}


	private void printOperations() {
		System.out.println();
		System.out.println("Here is what you can do: ");
		
		operations.forEach(op -> System.out.println(op));
	}
	
}
