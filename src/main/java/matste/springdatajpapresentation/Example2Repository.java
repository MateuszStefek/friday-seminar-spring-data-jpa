package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example2Repository extends JpaRepository<Item, Long> {
    List<Item> findByCode(String code);
    List<Item> readByCode(String code);
    List<Item> queryByCode(String code);
    List<Item> getWhateverByCode(String code);
    Item readOneByCode(String code);

    static void main(String[] args) {
        Example2Repository repository = getBean(Example2Repository.class);
        System.out.println(repository.findByCode("I-1"));
        System.out.println(repository.readByCode("I-2"));
        System.out.println(repository.queryByCode("I-3"));
        System.out.println(repository.getWhateverByCode("I-4"));
        //This code is unique
        System.out.println(repository.readOneByCode("I-10"));
        // This throws NonUniqueResultException
        System.out.println(repository.readOneByCode("I-1"));
    }
}

