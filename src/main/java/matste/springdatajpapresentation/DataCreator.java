package matste.springdatajpapresentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.PostConstruct;
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
        Warehouse warehouse = new Warehouse();
        warehouse.setCode(warehouseCode);
        em.persist(warehouse);

        for (int i = 0; i < numberOfItems; i++) {
            Item item = new Item();
            item.setCode("I-" + i);
            item.setWarehouse(warehouse);
            item.setStockLevel(10 + i);
            em.persist(item);

        }
    }
}
