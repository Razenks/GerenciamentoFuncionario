
public class Funcionario {
	private String nome;
	private double salarioBruto;
	private String cargo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double calcularSalLiquido() {
		double desconto = 0;
		if (salarioBruto > 0 && salarioBruto <= 1412) {
			desconto = salarioBruto * 0.08;
		} else if (salarioBruto > 1412 && salarioBruto <= 2666){
			desconto = salarioBruto * 0.10;
		} else if (salarioBruto > 2666 && salarioBruto <= 4000){
			desconto = salarioBruto * 0.13;
		} else if (salarioBruto > 4000 && salarioBruto <= 7786){
			desconto = salarioBruto * 0.15;
		}
		double salLiquido = salarioBruto - desconto;
		return salLiquido;
	}
}
