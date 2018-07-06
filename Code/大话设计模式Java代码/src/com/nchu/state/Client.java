package com.nchu.state;

public class Client {

	public static void main(String[] args) {
		Work emegentcyProjects = new Work();
		
		emegentcyProjects.setHour(9);
		emegentcyProjects.WriteProgram();
		emegentcyProjects.setHour(10);
		emegentcyProjects.WriteProgram();
		emegentcyProjects.setHour(12);
		emegentcyProjects.WriteProgram();
		emegentcyProjects.setHour(13);
		emegentcyProjects.WriteProgram();
		emegentcyProjects.setHour(14);
		emegentcyProjects.WriteProgram();
		emegentcyProjects.setHour(17);
		emegentcyProjects.WriteProgram();
		
//		emegentcyProjects.setTaskFinished(true);
		emegentcyProjects.setTaskFinished(false);
		
		emegentcyProjects.setHour(19);
		emegentcyProjects.WriteProgram();
		emegentcyProjects.setHour(22);
		emegentcyProjects.WriteProgram();
	}
}
