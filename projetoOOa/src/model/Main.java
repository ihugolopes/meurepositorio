package model;

public class Main {

	public static void main(String[] args) {
		Aluno a = new Aluno(1000L, "jose", 20, new String[] { "java", "angular" }, new Double[] { 7d, 6d });
		System.out.println("Aluno: " + a);

	}

}
