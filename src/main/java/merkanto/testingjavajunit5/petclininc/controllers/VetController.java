package merkanto.testingjavajunit5.petclininc.controllers;

import merkanto.testingjavajunit5.petclininc.fauxspring.Model;
import merkanto.testingjavajunit5.petclininc.services.VetService;

public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
