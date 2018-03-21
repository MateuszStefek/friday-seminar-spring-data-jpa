package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example12Repository extends JpaRepository<Item, Long> {
    List<Item> findTop3ByOrderByStockLevelDesc();
	List<Item> findFirst3ByCodeOrderByStockLevelDesc(String code);

    static void main(String[] args) {
        Example12Repository repository = getBean(Example12Repository.class);
        System.out.println(repository.findTop3ByOrderByStockLevelDesc());
		System.out.println(repository.findFirst3ByCodeOrderByStockLevelDesc("I-1"));
    }
}

