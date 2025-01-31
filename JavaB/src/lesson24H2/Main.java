package lesson24H2;

public class Main {
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.name = "Elvin";
		runner.distance = 500;
		runner.run();
		runner.train();

		Swimmer swimmer = new Swimmer();
		swimmer.name = "Emil";
		swimmer.swimTime = 2;
		swimmer.train();
		swimmer.swim();
	}
}
