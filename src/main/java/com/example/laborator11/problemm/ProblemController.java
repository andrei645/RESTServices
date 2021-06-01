package com.example.laborator11.problemm;


import com.example.laborator11.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProblemController {

    private final ProblemService problemService;

    @Autowired
    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @GetMapping(path = "api/v2/problemcontroller")
    public List<Problem> getProblem(){
        return problemService.findAllProblems();
    }

    @PostMapping(path = "api/v2/problemcontroller/response")
    public void postProblem(@RequestBody Problem problem){problemService.addProblem(problem);}

}
