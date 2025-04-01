package com.cp.Contests_management.Problem;

import org.springframework.stereotype.Service;

@Service
public class ProblemMapper {


   public Problem dtoToProblem(ProblemDto problemDto){
    
    if(problemDto == null) {
        throw new IllegalArgumentException("Competition DTO cannot be null");
    }
    
    Problem problem = new Problem();
    problem.setTitle(problemDto.title());
    problem.setLabel(problemDto.label());
    problem.setContent(problemDto.content());
    problem.setTimelimit(problemDto.timelimit());
    problem.setMemorylimit(problemDto.memorylimit());
    return problem;
   }

   public ProblemResponseDto ProblemtoResponseDto(Problem problem) {

    ProblemResponseDto problemResopnseDto = new ProblemResponseDto(
        problem.getTitle(),
        problem.getCompetition().getName(),
        problem.getCreator().getName(),
        problem.getLabel(),
        problem.getContent(),
        problem.getTimelimit(),
        problem.getMemorylimit() );


        return problemResopnseDto;

    }
    




}
