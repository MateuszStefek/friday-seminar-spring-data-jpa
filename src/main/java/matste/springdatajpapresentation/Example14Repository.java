package matste.springdatajpapresentation;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example14Repository extends JpaRepository<Item, Long> {
	Slice<Item> findByWarehouseCodeOrderByCode(String warehouseCode, Pageable pageable);

	Slice<Item> findByWarehouseCode(String warehouseCode, Pageable pageable);

	static void main(String[] args) {
		var repository = getBean(Example14Repository.class);
		var slice = repository.findByWarehouseCodeOrderByCode("WH-1",
				PageRequest.of(/* zero-based */2, 3));
		System.out.println(slice);
		System.out.println(slice.getContent());
	}
}

