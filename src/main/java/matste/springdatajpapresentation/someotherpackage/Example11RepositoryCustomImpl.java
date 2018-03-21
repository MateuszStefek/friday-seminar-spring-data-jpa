package matste.springdatajpapresentation.someotherpackage;

import matste.springdatajpapresentation.Example11Repository;
import matste.springdatajpapresentation.Example11RepositoryCustom;
import matste.springdatajpapresentation.Item;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class Example11RepositoryCustomImpl implements Example11RepositoryCustom {
	@PersistenceContext	EntityManager em;
	@Autowired Example11Repository repository;

	@Override
	public List<Item> myItems() {
		System.out.println("See! I can execute any code");
		return null;
	}
}
