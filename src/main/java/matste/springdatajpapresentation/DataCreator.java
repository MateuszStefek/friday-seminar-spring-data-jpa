package matste.springdatajpapresentation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class DataCreator {
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void createData() {
		warehouse("WH-1", 10);
		warehouse("WH-2", 11);
	}

	private void warehouse(String warehouseCode, int numberOfItems) {
		var warehouse = new Warehouse();
		warehouse.setCode(warehouseCode);
		em.persist(warehouse);

		for (int i = 0; i < numberOfItems; i++) {
			var item = new Item();
			item.setCode("I-" + i);
			item.setWarehouse(warehouse);
			item.setStockLevel(10 + i);
			em.persist(item);

		}
	}
}
