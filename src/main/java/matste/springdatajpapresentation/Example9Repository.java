package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example9Repository extends JpaRepository<Item, Long> {
	List<Item> findByABC(String code);

	static void main(String[] args) {
		var repository = getBean(Example9Repository.class);
		System.out.println(repository.findByABC("I-1"));
	}
}

