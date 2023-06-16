package pe.edu.idat.dsw1soapJ19;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Semana;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final Map<String, Semana> semana = new HashMap<>();

	@PostConstruct
	public void initData() {
		Semana lunes = new Semana();
		lunes.setName("Lunes");
		lunes.setTraductor("Traducido al ingles");
		lunes.setIngles("Monday");
		semana.put(lunes.getName(), lunes);

		Semana martes = new Semana();
		martes.setName("Martes");
		martes.setTraductor("Traducido al ingles");
		martes.setIngles("Tuesday");
		semana.put(martes.getName(), martes);

		
		Semana miercoles = new Semana();
		miercoles.setName("Miercoles");
		miercoles.setTraductor("Traducido al ingles");
		miercoles.setIngles("Wednesday");
		semana.put(miercoles.getName(), miercoles);

		Semana jueves = new Semana();
		jueves.setName("Jueves");
		jueves.setTraductor("Traducido al ingles");
		jueves.setIngles("Thursday");
		semana.put(jueves.getName(), jueves);

		Semana viernes = new Semana();
		viernes.setName("Viernes");
		jueves.setTraductor("Traducido al ingles");
		viernes.setIngles("Friday");
		semana.put(viernes.getName(), viernes);

		Semana sabad = new Semana();
		sabad.setName("Sabado");
		sabad.setTraductor("Traducido al ingles");
		sabad.setIngles("Saturday");
		semana.put(sabad.getName(), sabad);

		Semana domingo = new Semana();
		domingo.setName("Domingo");
		domingo.setTraductor("Traducido al ingles");
		domingo.setIngles("Sunday");
		semana.put(domingo.getName(), domingo);


		
	}

	public Semana findSemana(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return semana.get(name);
	}
    
}
