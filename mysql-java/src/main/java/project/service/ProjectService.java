package project.service;

import java.util.List;
import java.util.NoSuchElementException;

import project.dao.ProjectDao; 
import project.entity.Project;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();

	public Project addProject(Project project) {
		return projectDao.insertProject(project);
}

	public List<Project> fetchAllProjects(){
		return projectDao.fetchAllProjects();
}

	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(()-> new NoSuchElementException("Project with project ID = " + projectId + "doesn't exist."));
}
}








//package project.service;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.LinkedList;
//import java.util.List;
//
//import project.dao.ProjectDao;
//import project.entity.Project;
//import project.exception.DbException;
//
//public class ProjectService {
//	private static final String SCHEMA_FILE = "project_schema.sql";
//	private static final String DATA_FILE = "project_data.sql";
//	
//	private ProjectDao projectDao = new ProjectDao();
//	
//
//
//	private int semicolon;
//
//
//	private String content;
//	
//	public void createAndPopulateTables() {
//		loadFromFile(SCHEMA_FILE);
//		loadFromFile(DATA_FILE);
//	}
//
//	private void loadFromFile(String fileName) {
//		String content = readFileContent(fileName);
//		List<String> sqlStatements = convertContentToSqlStatements(content);
//		
//		projectDao.executeBatch(sqlStatements);
//	}
//
//	private List<String> convertContentToSqlStatements(String content) {
//		content = removeComments(content);
//		content = replaceWhitespaceSequenceWithSingleSpace(content);
//		return extractLinesFromContent(content);
//	}
//
//	private List<String> extractLinesFromContent(String content) {
//		List<String> lines = new LinkedList<>();
//		while (!content.isEmpty()) {
//			int semicolon = content.indexOf(";");
//			if (semicolon == -1) {
//				if (!content.isBlank()) {
//					lines.add(content);
//				}
//				content = "";
//			}
//			else {
//				lines.add(content.substring(0,semicolon).trim());
//				content = content.substring(semicolon+1);
//			}
//		}
//		return lines;
//	}
//
//	private String replaceWhitespaceSequenceWithSingleSpace(String content) {
//		return content.replaceAll("\\s+", " ");
//	}
//
//	private String removeComments(String content) {
//		StringBuilder builder = new StringBuilder(content);
//		int commentPos = 0;
//		
//		while ((commentPos = builder.indexOf("-- ", commentPos)) != -1) {
//			int eolPos = builder.indexOf("\n", commentPos +1);
//			
//			if (eolPos == -1) {
//				builder.replace(eolPos, builder.length(), "");
//			} else {
//				builder.replace(commentPos, eolPos + 1, "");
//			}
//		}
//		return builder.toString();
//	}
//
//	private String readFileContent(String fileName) {
//		try {
//			Path path = Paths.get(getClass().getClassLoader().getResource(fileName).toURI());
//			return Files.readString(path);
//		} catch (Exception e) {
//			throw new DbException(e);
//		}
//	}
//
//	public int getSemicolon() {
//		return semicolon;
//	}
//
//	public void setSemicolon(int semicolon) {
//		this.semicolon = semicolon;
//	}
//
//	public String getContent() {
//		return content;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}
//
//	public Project addProject(Project project) {
//		return projectDao.insertProject(project);
//	}
//}
