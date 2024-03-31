
package AnimalExample.zoo

import AnimalExample.zoo.processor.AnimalProcessor;

public class AnimalExample {
    public static void main(String[] args) {
        AnimalProcessor.processAnimal("Lion");
        AnimalProcessor.processAnimal(""); // Invalid animal name
        AnimalProcessor.processAnimal(null); // Invalid animal name
        AnimalProcessor.processAnimal("Elephant");
    }
}