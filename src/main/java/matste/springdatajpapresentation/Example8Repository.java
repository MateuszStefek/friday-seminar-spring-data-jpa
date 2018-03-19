package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example8Repository extends JpaRepository<Item, Long> {
    @Query("select i from Item i where i.code = ?1 and i.warehouse.virtual = false")
    List<Item> findBySpecialQuery(String code);

    static void main(String[] args) {
        Example8Repository repository = getBean(Example8Repository.class);

        // and item0_.code=? and warehouse1_.virtual=0
        System.out.println(repository.findBySpecialQuery("I-1"));
    }
}

