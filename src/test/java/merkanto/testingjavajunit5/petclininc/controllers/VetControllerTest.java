package merkanto.testingjavajunit5.petclininc.controllers;

import merkanto.testingjavajunit5.petclininc.ControllerTests;
import merkanto.testingjavajunit5.petclininc.fauxspring.Model;
import merkanto.testingjavajunit5.petclininc.fauxspring.ModelMapImpl;
import merkanto.testingjavajunit5.petclininc.model.Vet;
import merkanto.testingjavajunit5.petclininc.services.SpecialtyService;
import merkanto.testingjavajunit5.petclininc.services.VetService;
import merkanto.testingjavajunit5.petclininc.services.map.SpecialityMapService;
import merkanto.testingjavajunit5.petclininc.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class VetControllerTest implements ControllerTests {

    VetService vetService;
    SpecialtyService specialtyService;

    VetController vetController;

    @BeforeEach
    void setUp() {
        specialtyService = new SpecialityMapService();
        vetService = new VetMapService(specialtyService);

        vetController = new VetController(vetService);

        Vet vet1 = new Vet(1L, "joe", "buck", null);
        Vet vet2 = new Vet(2L, "Jimmy", "Smith", null);

        vetService.save(vet1);
        vetService.save(vet2);
    }

    @Test
    void listVets() {
        Model model = new ModelMapImpl();

        String view = vetController.listVets(model);

        assertThat("vets/index").isEqualTo(view);

        Set modelAttribute = (Set) ((ModelMapImpl) model).getMap().get("vets");

        assertThat(modelAttribute.size()).isEqualTo(2);
    }
}