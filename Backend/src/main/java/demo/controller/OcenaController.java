package demo.controller;

import demo.dto.OcenaDTO;
import demo.models.Film;
import demo.models.Ocena;
import demo.service.FilmService;
import demo.service.OcenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/oceny")
public class OcenaController {

    @Autowired
    private OcenaService ocenaService;

    @Autowired
    private FilmService filmService;

    @GetMapping
    public ResponseEntity<?> getAllOceny() {
        return new ResponseEntity<>(ocenaService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OcenaDTO> saveOcena(@RequestBody OcenaDTO ocenaDTO) {

        Film film = filmService.findById(ocenaDTO.getFilmId()).orElse(null);
        if (film == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Ocena ocena = new Ocena();
        ocena.setOcena(ocenaDTO.getOcena());
        ocena.setTresc(ocenaDTO.getTresc());
        ocena.setDataDodania(new Date());
        ocena.setWartosc(ocenaDTO.getWartosc());
        ocena.setAutor(ocenaDTO.getAutor());
        ocena.setFilm(film);

        ocenaService.save(ocena);

        return new ResponseEntity<>(ocenaDTO, HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getOcenaById(@PathVariable Long id) {
        Ocena ocena = ocenaService.findById(id).orElse(null);
        if (ocena != null) {
            return new ResponseEntity<>(ocena, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
