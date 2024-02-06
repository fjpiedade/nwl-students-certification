package phi.fjpiedade.nwlexpertjava.useCases;

import org.springframework.stereotype.Service;

import phi.fjpiedade.nwlexpertjava.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUserCase {
    
    public boolean execute(VerifyHasCertificationDTO dto){
        if(dto.getEmail().equals("fernandp.joao@gmail.com") && dto.getTechnology().equals("Java")){
            return true;
        }

        return false;
    }
}
