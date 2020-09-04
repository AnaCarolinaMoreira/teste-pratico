import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Service
public class IdentificaParImpar {

    public String identifica(String  query){

    try {
    int number = Integer.parseInt(query);
    int resto = number % 2;
    if (resto == 0) {
        return "Par";
    } else {
        return "Ímpar";
    }
    }catch (NumberFormatException ex){
        return "Número não valido";
    }
    }

}

@RestController
@RequestMapping("identifica")
public class NumberController {

    private final IdentificaParImpar identificaParImpar;
    @Autowired
    public NumberController(IdentificaParImpar identificaParImpar) {
        this.IdentificaParImpar = identificaParImpar;
    }




    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> identificaParImpar(@RequestParam String number){
        String response  = identificaParImpar.identifica(number);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}