package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example3Repository extends JpaRepository<Item, Long> {
    List<Item> findByStockLevelGreaterThanEqual(int minimumStockLevel);

    static void main(String[] args) {
        Example3Repository repository = getBean(Example3Repository.class);
        System.out.println(repository.findByStockLevelGreaterThanEqual(16));
    }
}

