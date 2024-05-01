package aula.rafael.primeirasemana;

public class MInhaClasse {
	
	
	public static void main(String[] args) {
		String primeiroNome ="Rafael";
		String segundoNome ="Alves";
	
		String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
		
		System.out.print(nomeCompleto);
		
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome){
		return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
	}
}
