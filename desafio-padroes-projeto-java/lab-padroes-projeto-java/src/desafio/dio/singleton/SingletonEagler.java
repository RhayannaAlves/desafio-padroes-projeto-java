package desafio.dio.singleton;

public class SingletonEagler {
	
	private static SingletonEagler instancia = new SingletonEagler();
	
	private SingletonEagler() {
		super();
	}
	
	public static SingletonEagler getInstancia() {
		return instancia;
	}
}
