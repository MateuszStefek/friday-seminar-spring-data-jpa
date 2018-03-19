package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example6Repository extends JpaRepository<Item, Long> {
    List<Item> findByWarehouseCodeAndStockLevelGreaterThan(String warehouseCode, int stockLevelBelow);

    static void main(String[] args) {
        Example6Repository repository = getBean(Example6Repository.class);
        System.out.println(repository.findByWarehouseCodeAndStockLevelGreaterThan("WH-2", 17));
    }
}

