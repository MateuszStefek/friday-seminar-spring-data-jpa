package matste.springdatajpapresentation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example13Repository extends JpaRepository<Item, Long> {
	Page<Item> findByWarehouseCodeOrderByCode(String warehouseCode, Pageable pageable);

	static void main(String[] args) {
		var repository = getBean(Example13Repository.class);
		var page = repository.findByWarehouseCodeOrderByCode("WH-1",
				PageRequest.of(/* zero-based */2, 3));
		System.out.println(page);
		System.out.println(page.getContent());
		System.out.println(page.getTotalElements());
	}
}

