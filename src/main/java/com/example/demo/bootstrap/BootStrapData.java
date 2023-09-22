package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        // Check to see if inhouse part list is empty for adding to list.
        if (partRepository.count() == 0){

            // Board piece added to in house parts list.
            InhousePart board = new InhousePart();
            board.setId(100);
            board.setName("Playing Board Piece");
            board.setPrice(5.0);
            board.setInv(10);
            partRepository.save(board);

            // Game pieces added to in house parts list.
            InhousePart game_pieces = new InhousePart();
            game_pieces.setId(200);
            game_pieces.setName("Game Pieces");
            game_pieces.setPrice(5.0);
            game_pieces.setInv(10);
            partRepository.save(game_pieces);

            // Board piece added to in house parts list.
            InhousePart user_manual = new InhousePart();
            user_manual.setId(300);
            user_manual.setName("User Manual");
            user_manual.setPrice(5.0);
            user_manual.setInv(10);
            partRepository.save(user_manual);
        }

        // Check to see if outsourced part list is empty before adding to list.
        if (outsourcedPartRepository.count() == 0){

            // Dice added to outsourced parts list.
            OutsourcedPart dice = new OutsourcedPart();
            dice.setCompanyName("Dice for All");
            dice.setName("Dice");
            dice.setInv(10);
            dice.setPrice(5.0);
            dice.setId(100L);
            outsourcedPartRepository.save(dice);

            // Packaging Material added to outsourced parts list.
            OutsourcedPart packaging = new OutsourcedPart();
            packaging.setCompanyName("Western Packaging Company");
            packaging.setName("Packaging Material");
            packaging.setInv(10);
            packaging.setPrice(5.0);
            packaging.setId(200L);
            outsourcedPartRepository.save(packaging);
        }

        Product chess = new Product("chess",25.00,15);
        Product checkers = new Product("checkers",25.00,15);
        Product go = new Product("go",25.00,15);
        Product monopoly = new Product("monopoly",25.00,15);
        Product scrabble = new Product("scrabble",25.00,15);
        productRepository.save(chess);
        productRepository.save(checkers);
        productRepository.save(go);
        productRepository.save(monopoly);
        productRepository.save(scrabble);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
