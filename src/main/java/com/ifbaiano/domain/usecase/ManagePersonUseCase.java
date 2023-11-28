package com.ifbaiano.domain.usecase;

import com.ifbaiano.domain.model.Person;

public interface ManagePersonUseCase {
    void createPerson();
    void updatePerson();
    void removePerson();
    Person findPersonByName();
}
