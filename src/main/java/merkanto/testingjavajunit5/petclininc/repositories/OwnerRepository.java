package merkanto.testingjavajunit5.petclininc.repositories;


import merkanto.testingjavajunit5.petclininc.model.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
