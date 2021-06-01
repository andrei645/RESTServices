package com.example.laborator11.problemm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemService {
     private ProblemRepository problemRepository;

     @Autowired
    public ProblemService(ProblemRepository problemRepository) {
        this.problemRepository = problemRepository;
    }

    public List<Problem> findAllProblems() {
         return problemRepository.findAll();
     }

     public void addProblem(Problem problem){
         problemRepository.save(problem);
    }
}
