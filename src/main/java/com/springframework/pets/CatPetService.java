package com.springframework.pets;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Service("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
