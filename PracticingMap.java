/*
 * Small practice exercise with the Map interface. Exercise proposed by Digital Innovation One (DIO) as part of their Inter Java Developer Bootcamp.
 */

package practicingmap;

import java.util.HashMap;
import java.util.Map;


public class PracticingMap {
	public static void main(String args[]) {
		Map <String, String> BrazilianStatesAndCapitals = new HashMap<>();
		
		//Puts elements into the Map
		BrazilianStatesAndCapitals.put("AC", "ACRE");
		BrazilianStatesAndCapitals.put("AL", "ALAGOAS");
		BrazilianStatesAndCapitals.put("AP", "AMAPÁ");
		BrazilianStatesAndCapitals.put("AM", "AMAZONAS");
		BrazilianStatesAndCapitals.put("BA", "BAHIA");
		BrazilianStatesAndCapitals.put("CE", "CEARÁ");
		BrazilianStatesAndCapitals.put("DF", "DISTRITO FEDERAL");
		BrazilianStatesAndCapitals.put("ES", "ESPÍRITO SANTO");
		BrazilianStatesAndCapitals.put("GO", "GOIÁS");
		BrazilianStatesAndCapitals.put("MA", "MANAUS");
		BrazilianStatesAndCapitals.put("MT", "MATO GROSSO");
		BrazilianStatesAndCapitals.put("MS", "MATO GROSSO DO SUL");
		BrazilianStatesAndCapitals.put("MG", "MINAS GERAIS");
		BrazilianStatesAndCapitals.put("PA", "PARÁ");
		BrazilianStatesAndCapitals.put("PB", "PARAIBA");
		BrazilianStatesAndCapitals.put("PR", "PARANÁ");
		BrazilianStatesAndCapitals.put("PE", "PERNAMBUCO");
		BrazilianStatesAndCapitals.put("PI", "PIUAÍ");
		BrazilianStatesAndCapitals.put("RR", "RONDÔNIA");
		BrazilianStatesAndCapitals.put("RO", "RORAIMA");
		BrazilianStatesAndCapitals.put("RJ", "RIO DE JANEIRO");
		BrazilianStatesAndCapitals.put("RN", "RIO GRANDE DO NORTE");
		BrazilianStatesAndCapitals.put("RS", "RIO GRANDE DO SUL");
		BrazilianStatesAndCapitals.put("SC", "SANTA CATARINA");
		BrazilianStatesAndCapitals.put("SP", "SÃO PAULO");
		BrazilianStatesAndCapitals.put("SE", "SERGIPE");
		BrazilianStatesAndCapitals.put("TO", "TOCANTINS");
		
		//Exhibit the map as a set of key value
		System.out.println(BrazilianStatesAndCapitals.entrySet());
		
		BrazilianStatesAndCapitals.remove("MG");
		
		System.out.println(BrazilianStatesAndCapitals.entrySet());
		
		System.out.println(BrazilianStatesAndCapitals.size());
		
		BrazilianStatesAndCapitals.remove("MS", "MATO GROSSO DO SUL");
		
		System.out.println(BrazilianStatesAndCapitals.entrySet());
		
		System.out.println(BrazilianStatesAndCapitals.containsKey("SC"));
		
		System.out.println(BrazilianStatesAndCapitals.containsValue("MARANHÃO"));
	}
}
