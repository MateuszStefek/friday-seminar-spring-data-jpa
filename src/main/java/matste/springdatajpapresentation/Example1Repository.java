package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example1Repository extends JpaRepository<Item, Long> {
	List<Item> findByCode(String code);

	static void main(String[] args) {
		var repository = getBean(Example1Repository.class);
		System.out.println(repository.findByCode("I-2"));
	}
}
