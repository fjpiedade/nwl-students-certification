package phi.fjpiedade.nwlexpertjava.controllers;

import org.springframework.web.bind.annotation.RestController;

import phi.fjpiedade.nwlexpertjava.dto.VerifyHasCertificationDTO;
import phi.fjpiedade.nwlexpertjava.useCases.VerifyIfHasCertificationUserCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    
    @Autowired
    private VerifyIfHasCertificationUserCase verifyIfHasCertificationUserCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyCertificationDTO) {
        var result = this.verifyIfHasCertificationUserCase.execute(verifyCertificationDTO);
        
        if(result){
            return "User already done the Exam!";
        }
        return "User can do the Exam!";
    }
    
}
