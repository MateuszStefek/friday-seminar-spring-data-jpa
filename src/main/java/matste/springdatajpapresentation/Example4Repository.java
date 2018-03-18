package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example4Repository extends JpaRepository<Item, Long> {
    List<Item> findByCodeStartsWithIgnoreCase(String minimumCode);

    static void main(String[] args) {
        Example4Repository repository = getBean(Example4Repository.class);
        System.out.println(repository.findByCodeStartsWithIgnoreCase("i"));
    }
}

