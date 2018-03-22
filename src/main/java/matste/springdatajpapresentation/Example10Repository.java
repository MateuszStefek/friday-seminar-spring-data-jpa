package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example10Repository extends JpaRepository<Item, Long> {
	default List<Item> findByAnyCode(String code) {
		return findByWarehouseCodeOrCode(code, code);
	}

	List<Item> findByWarehouseCodeOrCode(String warehouseCode, String itemCode);

	static void main(String[] args) {
		var repository = getBean(Example10Repository.class);
		System.out.println(repository.findByAnyCode("I-1"));
	}
}

