package com.fullstack19.backend.controller;

@RestController
@RequestMapping("/api/programs")
@CrossOrigin(origins="*")
public class ProgramController {

    @Autowired
    ProgramRepository repo;

    @GetMapping
    public List<Program> getPrograms(){
        return repo.findAll();
    }

    @PostMapping
    public Program addProgram(@RequestBody Program program){
        return repo.save(program);
    }
}