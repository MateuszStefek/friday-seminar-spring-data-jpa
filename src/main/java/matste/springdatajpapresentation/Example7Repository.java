package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example7Repository extends JpaRepository<Item, Long> {
    List<Item> findOldStyleByDescription(String description);
    List<Item> findByDescription(Optional<String> description);

    static void main(String[] args) {
        Example7Repository repository = getBean(Example7Repository.class);

		//from item item0_ where item0_.description is null
        System.out.println(repository.findOldStyleByDescription(null));

		//from item item0_ where item0_.description=?
		System.out.println(repository.findOldStyleByDescription("A"));

        //from item item0_ where item0_.description is null
        System.out.println(repository.findByDescription(Optional.empty()));

        //from item item0_ where item0_.description=?
        System.out.println(repository.findByDescription(Optional.of("Ala ma kota")));
    }
}

