package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example11Repository extends JpaRepository<Item, Long>, Example11RepositoryCustom {

	static void main(String[] args) {
		var repository = getBean(Example11Repository.class);
		System.out.println(repository.myItems());
	}
}

