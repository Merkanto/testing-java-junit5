package merkanto.testingjavajunit5.petclininc.services;

import merkanto.testingjavajunit5.petclininc.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
 }
