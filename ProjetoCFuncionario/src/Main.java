import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe o nome do funcionário: ");
		String nome = sc.next();
		funcionario.setNome(nome);
		
		System.out.println("Informe o salário do funcionario: ");
		double salario = sc.nextDouble();
		funcionario.setSalarioBruto(salario);
		
		System.out.println("Informe o cargo do funcionário: ");
		String cargo = sc.next();
		funcionario.setCargo(cargo);
		
		double salarioLiquido = funcionario.calcularSalLiquido();
		System.out.println("Esse é o seu salario liquido: " + salarioLiquido);
		
		

	}

}
