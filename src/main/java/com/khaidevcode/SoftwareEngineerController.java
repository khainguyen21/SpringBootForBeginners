package com.khaidevcode;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        // fetch data from amigos database and in software-engineer table
        return softwareEngineerService.getAllSoftwareEngineers();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineersById(@PathVariable Integer id) {
        // fetch data from amigos database and in software-engineer table
        return softwareEngineerService.getSoftwareEngineerById(id);
    }

    @DeleteMapping("{id}")
    public void deleteEngineersById(@PathVariable Integer id) {
        // fetch data from amigos database and in software-engineer table
        softwareEngineerService.deleteSoftwareEngineerById(id);
    }

    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        // add data to amigos database and to software-engineer table
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }

    @PutMapping("{id}")
    public void updateSoftwareEngineerById(@RequestBody SoftwareEngineer softwareEngineer,
                                           @PathVariable Integer id) {
        softwareEngineerService.updateSoftwareEngineerById(id, softwareEngineer);

    }
}
