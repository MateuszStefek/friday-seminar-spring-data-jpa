package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example5Repository extends JpaRepository<Item, Long> {
    List<Item> findByWarehouseCode(String warehouseCode);

    static void main(String[] args) {
        Example5Repository repository = getBean(Example5Repository.class);
        System.out.println(repository.findByWarehouseCode("WH-2"));
    }
}

