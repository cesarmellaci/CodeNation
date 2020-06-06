package Principal;

public class CalculadoraSalario {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
			System.out.println(calculadoraSalario.Calculos(10000.00));
	}

	// Calcular o desconto do INSS sobre o valor do salario bruto	
	public long Calculos(double valorSalarioBruto) {
		//double salarioBruto;
		double salarioBrutoINSS;
		double salarioLiquido;

		if (valorSalarioBruto <= 1500.00) {
				salarioBrutoINSS = (valorSalarioBruto - (valorSalarioBruto * 0.08));
		    } 
			if (valorSalarioBruto > 4000.00) {
				salarioBrutoINSS = (valorSalarioBruto - (valorSalarioBruto * 0.11));
		    } else {
				salarioBrutoINSS = (valorSalarioBruto - (valorSalarioBruto * 0.09));
		    }
			
		// Calcular o desconto de IRRF sobre o valor do salario bruto coo INSS
			if (salarioBrutoINSS > 6000.00) {
				salarioLiquido = (salarioBrutoINSS - (salarioBrutoINSS * 0.15));
			} else {
				if (salarioBrutoINSS > 3000.00) {
					salarioLiquido = (salarioBrutoINSS - (salarioBrutoINSS * 0.075));
				} else {
					salarioLiquido = salarioBrutoINSS;
				}
			}
			if (valorSalarioBruto < 1039.00) {
				salarioLiquido = valorSalarioBruto;
			}

			//String textosalario = Double.toString(salarioLiquido);
			//salario = Integer.valueOf(textosalario).intValue();
			//System.out.println("Valor do desconto igual a :" + salario);
			return Math.round(salarioLiquido);
	}
}
